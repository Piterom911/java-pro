package com.telran.lessons.lesson26;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) {
        Book book = new Book();
        Class<? extends Book> ourClass = book.getClass();
        System.out.println(ourClass.getName());

        Method[] declaredMethods = ourClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
        try {
            Method declaredMethod = ourClass.getDeclaredMethod("printBookInfo");
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(book);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
