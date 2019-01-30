package com.hhrb.dp.visitor.salesman;

import com.hhrb.dp.visitor.employee.WeChatEmployee;

/**
 * User: Z J Wu Date: 2019-01-30 Time: 14:14 Package: com.hhrb.dp.visitor.salesman
 */
public class AceSalesman extends Salesman {

  public AceSalesman() {
  }

  @Override
  public void visit(WeChatEmployee weChatEmployee) {
    boolean hateMe;
    int cnt = 0;

    do {
      hateMe = weChatEmployee.hateSalesman();
      ++cnt;
    } while (hateMe && cnt < 3);

    if (hateMe) {
      System.out.println("Fail");
      return;
    }
    if (weChatEmployee.showMeTheMoney() < 30) {
      System.out.println("Fail");
    } else {
      System.out.println("Succeed");
    }
  }
}
