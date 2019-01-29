package com.hhrb.dp.command;

public class InitiateLightSpeedEngineSignal implements SpaceShipControlSignal {

  private SpaceShip spaceShip;

  @Override
  public void act() {
    spaceShip.initLightSpeedEngine();
  }
}
