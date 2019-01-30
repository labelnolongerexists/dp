package com.hhrb.dp.bridge;

/**
 * User: Z J Wu
 * Date: 2019/01/29
 * Time: 19:09
 * Package: dp.bridge
 */
public abstract class Car extends Vehicle {

  public Car(Engine engine) {
    super(engine);
  }

  @Override
  public void initiate() {
    System.out.println("Car picks up " + pickupPassenger() + " passengers.");
    super.initiate();
  }

  public abstract int pickupPassenger();

}
