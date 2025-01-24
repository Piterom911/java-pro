package com.telran.practice.practice20;

public class TestApp {

    public static void main(String[] args) {
        TestInteger testInteger = new TestInteger(5);
        Integer integer = testInteger.getObjInt();
        System.out.println(integer);

        TestString testString = new TestString("Hello");
        String objStr = testString.getObjStr();
        System.out.println(objStr);

        TestObject object = new TestObject(5.2);
        Object obj = object.getObj();
        System.out.println(obj);

        Test<Integer> number = new Test<>(5);
        Test<Boolean> testBoolean = new Test<>(true);
    }
}
