package com.hhrb.dp.observer;

/**
 * User: Z J Wu Date: 2019-01-30 Time: 16:24 Package: com.hhrb.dp.observer
 */
public class Publisher {

  private Observable observable;

  public Publisher(Observable observable) {
    this.observable = observable;
  }

  public void publish(String msg) {
    System.out.println("Message is published to " + observable.receiveMessage(msg) + " observers");
  }

  public static void main(String[] args) {
    Observable notifier = new Notifier();
    notifier.addObserver(new Subscriber("ZhangSan"));
    notifier.addObserver(new Subscriber("LiSi"));

    Publisher p = new Publisher(notifier);
    p.publish("My name is Tony Stark");
  }

}
