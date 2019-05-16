package com.hhrb.dp.crackncm;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static com.google.common.base.Preconditions.checkState;

/**
 * User: Z J Wu
 * Date: 2019/5/17
 * Time: 0:40
 * Package: com.hhrb.dp.crackncm
 */
public class NCM {

  private static final byte[] CORE_KEY = {
      0x68, 0x7A, 0x48, 0x52, 0x41, 0x6D, 0x73, 0x6F, 0x35, 0x6B, 0x49, 0x6E,
      0x62, 0x61, 0x78, 0x57};
  private static final byte[] MODIFY_KEY = {0x23, 0x31, 0x34, 0x6C, 0x6A, 0x6B,
      0x5F, 0x21, 0x5C, 0x5D, 0x26, 0x30, 0x55, 0x3C, 0x27, 0x28};

  private static final void copyNcmFile(String ncmFile, String outputFile)
      throws IOException {
    final byte[] buffer = new byte[4096];
    try (FileInputStream fis = new FileInputStream(new File(ncmFile));
         FileOutputStream fout = null) {
      fis.read(buffer, 0, 8);
      checkState("CTENFDAM".equals(new String(buffer, 0, 8)));
      fis.skip(2);
      fis.read(buffer, 0, 4);
      int len = toInt(buffer);
      checkState(len > 0, "BrokenFile");
      final byte[] keyData = new byte[len];
      fis.read(keyData);
      for (int i = 0; i < keyData.length; i++) {
        keyData[i] ^= 0x64;
      }
    }
  }

  private static byte[] aes128EcbDecrypt(byte[] src, byte[] key) throws Exception {
    int len = src.length, mod = len % 16;
    byte[] content = src;
    if (mod != 0) {
      content = new byte[len + 16 - mod];
      System.arraycopy(src, 0, content, 0, len);
    }
    SecretKeySpec sks = new SecretKeySpec(key, "AES");// 转换为AES专用密钥
    Cipher cipher = Cipher.getInstance("AES_128/ECB/NoPadding");// 实例化
    cipher.init(Cipher.DECRYPT_MODE, sks);// 使用密钥初始化，设置为解密模式
    return cipher.doFinal(content);// 执行操作
  }

  private static final int toInt(byte[] b) {
    int i = 0;
    i |= b[0] & 0xff;
    i |= (b[1] & 0xff) << 8;
    i |= (b[2] & 0xff) << 16;
    i |= (b[3] & 0xff) << 24;
    return i;
  }

  public static void main(String[] args) {
  }
}
