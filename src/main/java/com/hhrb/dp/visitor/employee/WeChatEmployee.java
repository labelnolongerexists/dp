package com.hhrb.dp.visitor.employee;

import com.hhrb.dp.visitor.Visitor;

/**
 * User: Z J Wu Date: 2019-01-30 Time: 14:11 Package: com.hhrb.dp.visitor.employee
 */
public class WeChatEmployee extends Employee {

  public WeChatEmployee(int percentOfHateSalesMan) {
    super(percentOfHateSalesMan);
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  @Override
  public int showMeTheMoney() {
    return 100;
  }
}
