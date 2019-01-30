package com.hhrb.dp.adapter;

import com.google.common.base.Preconditions;
import com.hhrb.dp.adapter.impl.PreferServiceAdapter;

import java.util.Optional;

/**
 * User: Z J Wu Date: 2019/01/29 Time: 15:52 Package: dp.adapter
 */
public class Client {

  private YetAnotherPreferService preferService;

  public Client(YetAnotherPreferService preferService) {
    this.preferService = preferService;
  }

  public String loadPrefer(long id) {
    Optional<String> op = preferService.getUserPreferById(id);
    Preconditions.checkState(op.isPresent());
    return op.get();
  }

  public static void main(String[] args) {
    Client client = new Client(new PreferServiceAdapter());
    System.out.println(client.loadPrefer(4l));
  }

}
