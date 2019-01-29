package com.hhrb.dp.command;

public class LaunchSignal implements SpaceShipControlSignal {

  private SpaceShip spaceShip;

  @Override
  public void act() {
    spaceShip.launch();
  }
}
