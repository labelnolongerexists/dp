package com.hhrb.dp.visitor.employee;

import com.hhrb.dp.visitor.Visitor;

/**
 * User: Z J Wu Date: 2019-01-30 Time: 14:13 Package: com.hhrb.dp.visitor.employee
 */
public class TinyCompanyEmployee extends Employee {

  protected TinyCompanyEmployee(int percentOfHateSalesMan) {
    super(percentOfHateSalesMan);
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  @Override
  public int showMeTheMoney() {
    return 20;
  }
}
