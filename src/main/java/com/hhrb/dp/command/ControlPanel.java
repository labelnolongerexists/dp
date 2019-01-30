package com.hhrb.dp.command;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ControlPanel {

  public static final int SIGNAL_LAUNCH = 0;
  public static final int SIGNAL_INIT_LIGHT_SPEED_ENGINE = 1;
  public static final int SIGNAL_LOAD_SHIPMENT = 2;

  private Map<Integer, SpaceShipControlSignal> signalMap;

  public ControlPanel() {
    this.signalMap = Maps.newHashMapWithExpectedSize(3);
    signalMap.put(SIGNAL_LAUNCH, () -> SpaceShip.getShip().launch());
    signalMap.put(SIGNAL_INIT_LIGHT_SPEED_ENGINE, () -> SpaceShip.getShip().initLightSpeedEngine());
    signalMap.put(SIGNAL_LOAD_SHIPMENT, () -> SpaceShip.getShip().load());
  }

  public void sendSignal(SpaceShipControlSignal signal) {
    if (signal != null) {
      signal.act();
    }
  }

  public void sendSignal(int signal) {
    sendSignal(signal, null);
  }

  public void sendSignal(int signal, ImmutableList.Builder<SpaceShipControlSignal> macroBuilder) {
    SpaceShipControlSignal s = signalMap.get(signal);
    if (s != null) {
      s.act();
      if (macroBuilder != null) {
        macroBuilder.add(s);
      }
    }
  }

  public void executeMacro(List<SpaceShipControlSignal> macro) {
    if (CollectionUtils.isNotEmpty(macro)) {
      macro.stream().forEach(this::sendSignal);
    }
  }

  public List<SpaceShipControlSignal> finishRecord(
    ImmutableList.Builder<SpaceShipControlSignal> macroBuilder) {
    return macroBuilder == null ? Collections.emptyList() : macroBuilder.build();
  }

  public ImmutableList.Builder<SpaceShipControlSignal> startRecord() {
    return new ImmutableList.Builder();
  }

  public static void main(String[] args) {
    ControlPanel cp = new ControlPanel();
    ImmutableList.Builder<SpaceShipControlSignal> macroBuilder = cp.startRecord();
    cp.sendSignal(SIGNAL_INIT_LIGHT_SPEED_ENGINE, macroBuilder);
    cp.sendSignal(SIGNAL_LOAD_SHIPMENT, macroBuilder);
    List<SpaceShipControlSignal> macro = cp.finishRecord(macroBuilder);
    System.out.println("---------------------------------");
    cp.executeMacro(macro);
  }

}
