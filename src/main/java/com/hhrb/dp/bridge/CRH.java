package com.hhrb.dp.bridge;

/**
 * User: Z J Wu
 * Date: 2019/01/29
 * Time: 19:19
 * Package: dp.bridge
 */
public class CRH extends Locomotive {

  public CRH(Engine engine) {
    super(engine);
  }

  @Override
  public int mount() {
    return 14;
  }
}
