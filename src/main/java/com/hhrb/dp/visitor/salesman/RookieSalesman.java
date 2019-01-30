package com.hhrb.dp.visitor.salesman;

import com.hhrb.dp.visitor.employee.WeChatEmployee;

/**
 * User: Z J Wu Date: 2019-01-30 Time: 14:14 Package: com.hhrb.dp.visitor.salesman
 */
public class RookieSalesman extends Salesman {

  public RookieSalesman() {
  }

  @Override
  public void visit(WeChatEmployee weChatEmployee) {
    boolean hateMe = weChatEmployee.hateSalesman();
    if (hateMe) {
      System.out.println("Fail");
      return;
    }
    if (weChatEmployee.showMeTheMoney() < 50) {
      System.out.println("Fail");
    } else {
      System.out.println("Succeed");
    }
  }
}
