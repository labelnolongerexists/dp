package com.hhrb.dp.visitor;

import com.hhrb.dp.visitor.employee.WeChatEmployee;
import com.hhrb.dp.visitor.salesman.AceSalesman;
import com.hhrb.dp.visitor.salesman.RookieSalesman;

/**
 * User: Z J Wu Date: 2019-01-30 Time: 14:33 Package: com.hhrb.dp.visitor
 */
public class Runner {

  public static void main(String[] args) {
    WeChatEmployee weChatEmployee1 = new WeChatEmployee(50);
    RookieSalesman s1 = new RookieSalesman();
    for (int i = 0; i < 10; i++) {
      s1.visit(weChatEmployee1);
    }
    System.out.println("---------------------------------");
    AceSalesman s2 = new AceSalesman();
    for (int i = 0; i < 10; i++) {
      s2.visit(weChatEmployee1);
    }
  }
}
