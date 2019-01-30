package com.hhrb.dp.adapter.impl;

import com.hhrb.dp.adapter.YetAnotherPreferService;

import java.util.Optional;

/**
 * User: Z J Wu Date: 2019/01/29 Time: 15:53 Package: dp.adapter.impl
 */
public class PreferServiceAdapter extends PreferServiceImpl implements YetAnotherPreferService {

  public Optional<String> getUserPreferById(long id) {
    return Optional.ofNullable(getPrefer((int) id));
  }
}
