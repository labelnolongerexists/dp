package com.hhrb.dp.bridge;

/**
 * User: Z J Wu Date: 2019-01-30 Time: 11:31 Package: com.hhrb.dp.bridge
 */
public abstract class AirCraftCarrier extends Vehicle {

  public AirCraftCarrier(Engine engine) {
    super(engine);
  }

  @Override
  public void initiate() {
    System.out.println("AirCraftCarrier carried " + carryAirCraft() + " air crafts.");
    super.initiate();
  }

  public abstract int carryAirCraft();
}
