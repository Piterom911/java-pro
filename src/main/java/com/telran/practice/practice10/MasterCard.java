package com.telran.practice.practice10;

public class MasterCard extends Card {

    private int masterCardId;

    public MasterCard(int masterCardId) {
        this.masterCardId = masterCardId;
    }

    public int getMasterCardId() {
        return masterCardId;
    }

    public int getCardId() {
        return masterCardId;
    }

    @Override
    public String toString() {
        return "MasterCard{" +
                "masterCardId=" + masterCardId +
                '}';
    }
}
