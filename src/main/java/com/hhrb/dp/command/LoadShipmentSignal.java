package com.hhrb.dp.command;

public class LoadShipmentSignal implements SpaceShipControlSignal {

  private SpaceShip core;

  @Override
  public void act() {
    core.load();
  }
}
