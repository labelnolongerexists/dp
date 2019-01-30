package com.hhrb.dp.adapter.impl;

import com.hhrb.dp.adapter.PreferService;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * User: Z J Wu Date: 2019/01/29 Time: 15:51 Package: dp.adapter.impl
 */
public class PreferServiceImpl implements PreferService {

  public String getPrefer(int id) {
    return RandomStringUtils.randomAlphanumeric(32);
  }
}
