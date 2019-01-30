package com.hhrb.dp.bridge;

/**
 * User: Z J Wu Date: 2019-01-30 Time: 11:30 Package: com.hhrb.dp.bridge
 */
public class GeraldRFordAirCraftCarrier extends AirCraftCarrier {

  public GeraldRFordAirCraftCarrier(Engine engine) {
    super(engine);
  }

  @Override
  public int carryAirCraft() {
    return 25;
  }
}
