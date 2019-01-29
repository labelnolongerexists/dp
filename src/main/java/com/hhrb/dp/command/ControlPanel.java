package com.hhrb.dp.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ControlPanel {
  public static final int SIGNAL_LAUNCH = 0;
  public static final int SIGNAL_INIT_LIGHT_SPEED_ENGINE = 1;
  public static final int SIGNAL_LOAD_SHIPMENT = 2;

  private Map<Integer, SpaceShipControlSignal> signalMap;

  public ControlPanel() {
    this.signalMap = new HashMap<>(3);
    signalMap.put(SIGNAL_LAUNCH, () -> SpaceShip.getShip().launch());
    signalMap.put(SIGNAL_INIT_LIGHT_SPEED_ENGINE, () -> SpaceShip.getShip().initLightSpeedEngine());
    signalMap.put(SIGNAL_LOAD_SHIPMENT, () -> SpaceShip.getShip().load());
  }

  public void sendSignal(int signal) {
    this.signalMap.get(signal).act();
  }


  public static void main(String[] args) {
    ControlPanel cp = new ControlPanel();
    cp.sendSignal(SIGNAL_INIT_LIGHT_SPEED_ENGINE);
  }

}
