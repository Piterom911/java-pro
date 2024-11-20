package com.telran.practice.practice04.lamptask;

public class LightBulb implements Switchable {

    private boolean isOn;

    @Override
    public void on(boolean on) {
        isOn = on;
    }

    @Override
    public void checkState() {
        System.out.println("Light Lamp is" + (isOn ? " on" : " off"));
    }

}
