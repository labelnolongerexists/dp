package com.hhrb.dp.bridge;

/**
 * User: Z J Wu
 * Date: 2019/01/29
 * Time: 18:58
 * Package: dp.bridge
 */
public abstract class Vehicle {

  private Engine engine;

  public Vehicle(Engine engine) {
    this.engine = engine;
  }

  public void initiate() {
    getEngine().startEngine();
  }

  public Engine getEngine() {
    return engine;
  }
}
