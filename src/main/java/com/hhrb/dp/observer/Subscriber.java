package com.hhrb.dp.observer;

/**
 * User: Z J Wu Date: 2019-01-30 Time: 14:46 Package: com.hhrb.dp.observer
 */
public class Subscriber implements Observer {

  private String name;

  public Subscriber(String name) {
    this.name = name;
  }

  @Override
  public void beingNotified(String msg) {
    System.out.println(name + " received notification");
  }
}
