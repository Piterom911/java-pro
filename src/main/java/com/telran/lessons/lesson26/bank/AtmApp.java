package com.telran.lessons.lesson26.bank;

import java.lang.reflect.Field;

public class AtmApp {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ATM atm = new ATM();
        atm.depositMoney(500);

        Class<? extends ATM> aClass = atm.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }

        Field iban = aClass.getDeclaredField("iban");
        iban.setAccessible(true);
        Object o = iban.get(atm);
        System.out.println(o);

        iban.set(atm, "DE 234 234 2234 2344");
        atm.depositMoney(1000);
    }
}
