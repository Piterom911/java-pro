package com.telran.lessons.lesson26.bank;

public class ATM {

    private final String iban = "TR 22345 4563 345345 45";

    public void depositMoney(int amount) {
        transferMoney(amount);
    }

    private void transferMoney(int amount) {
        System.out.println("Use " + iban);
        System.out.println("Money transferred to " + iban);
    }
}
