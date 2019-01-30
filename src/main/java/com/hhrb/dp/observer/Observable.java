package com.hhrb.dp.observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * User: Z J Wu Date: 2019-01-30 Time: 14:43 Package: com.hhrb.dp.observer
 */
public abstract class Observable {

  private List<Observer> observables = Lists.newArrayList();

  public void addObserver(Observer observer) {
    observables.add(observer);
  }

  public int receiveMessage(String msg) {
    System.out.println("Observable received msg - " + msg);
    return notifyObversers(msg);
  }

  public int notifyObversers(String msg) {
    int cnt = 0;
    for (Observer o : observables) {
      try {
        o.beingNotified(msg);
        ++cnt;
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return cnt;
  }

}
