package com.hhrb.dp.crackncm;

import com.google.common.collect.Lists;

import java.io.File;
import java.util.List;

/**
 * User: Z J Wu
 * Date: 2019/5/17
 * Time: 0:49
 * Package: com.hhrb.dp.crackncm
 */
public class FileUtils {

  public static final List<File> findNcmFiles(String path) {
    List<File> files = Lists.newArrayListWithExpectedSize(100);
    findNcmFiles(path, files);
    return files;
  }

  private static final void findNcmFiles(String path, List<File> ncmFiles) {
    File file = new File(path);
    if (file.isFile()) {
      String fileName = file.getName();
      if (fileName.toLowerCase().endsWith(".ncm")) {
        ncmFiles.add(file.getAbsoluteFile());
      }
      return;
    }
    File[] sub = file.listFiles();
    for (File f : sub) {
      findNcmFiles(f.getPath(), ncmFiles);
    }
  }

  public static void main(String[] args) {
    List<File> files = findNcmFiles("D:/CloudMusic");
    files.stream().forEach(System.out::println);
  }

}
