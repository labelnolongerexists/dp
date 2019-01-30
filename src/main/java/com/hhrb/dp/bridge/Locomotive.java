package com.hhrb.dp.bridge;

/**
 * User: Z J Wu
 * Date: 2019/01/29
 * Time: 19:17
 * Package: dp.bridge
 */
public abstract class Locomotive extends Vehicle {

  public Locomotive(Engine engine) {
    super(engine);
  }

  @Override
  public void initiate() {
    System.out.println("Locomotive mounts " + mount() + " coaches");
    super.initiate();
  }

  public abstract int mount();
}
