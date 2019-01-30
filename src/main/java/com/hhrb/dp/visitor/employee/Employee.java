package com.hhrb.dp.visitor.employee;

import com.hhrb.dp.visitor.Visitable;

import java.util.Random;

/**
 * User: Z J Wu Date: 2019-01-30 Time: 14:18 Package: com.hhrb.dp.visitor.employee
 */
public abstract class Employee implements Visitable {

  private final Random random = new Random();

  private final int percentOfHateSalesMan;

  public Employee(int percentOfHateSalesMan) {
    this.percentOfHateSalesMan = percentOfHateSalesMan;
  }

  public boolean hateSalesman() {
    return random.nextInt(100) < percentOfHateSalesMan;
  }

}
