package com.hhrb.dp.visitor;

import com.hhrb.dp.visitor.employee.TinyCompanyEmployee;
import com.hhrb.dp.visitor.employee.WeChatEmployee;

/**
 * User: Z J Wu Date: 2019-01-30 Time: 14:08 Package: com.hhrb.dp.visitor
 */
public interface Visitor {

  void visit(WeChatEmployee weChatEmployee);

  void visit(TinyCompanyEmployee tinyCompanyEmployee);
}
