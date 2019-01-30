package com.hhrb.dp.bridge;

/**
 * User: Z J Wu Date: 2019/01/29 Time: 19:19 Package: dp.bridge
 */
public class Client {

  public static void main(String[] args) {
    Vehicle v1 = new ChevyCruze(new PetrolEngine());
    Vehicle v2 = new CRH(new ElectricEngine());
    Vehicle v3 = new GeraldRFordAirCraftCarrier(new NuclearReactorEngine());

    v1.initiate();
    System.out.println("---------------------------------");
    v2.initiate();
    System.out.println("---------------------------------");
    v3.initiate();
  }
}
