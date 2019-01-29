package com.hhrb.dp.command;

public class SpaceShip {
  private static final SpaceShip ship = new SpaceShip();

  public static SpaceShip getShip() {
    return ship;
  }

  public void launch() {
    System.out.println("Space ship is launched");
  }

  public void initLightSpeedEngine() {
    System.out.println("Space ship initiated light speed engine");
  }

  public void load() {
    System.out.println("Space ship loaded shipment.");
  }
}
