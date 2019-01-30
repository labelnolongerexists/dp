package com.hhrb.dp.bridge;

/**
 * User: Z J Wu
 * Date: 2019/01/29
 * Time: 19:15
 * Package: dp.bridge
 */
public class ChevyCruze extends Car {

  public ChevyCruze(Engine engine) {
    super(engine);
  }

  @Override
  public int pickupPassenger() {
    return 3;
  }
}
