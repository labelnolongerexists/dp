package com.hhrb.dp.visitor;

/**
 * User: Z J Wu Date: 2019-01-30 Time: 14:09 Package: com.hhrb.dp.visitor
 */
public interface Visitable {

  void accept(Visitor visitor);

  boolean hateSalesman();

  int showMeTheMoney();
}
