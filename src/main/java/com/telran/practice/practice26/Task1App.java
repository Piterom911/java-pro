package com.telran.practice.practice26;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task1App {
    public static void main(String[] args) throws NoSuchMethodException {
        Task1 task1 = new Task1();
        Class<? extends Task1> aClass = task1.getClass();
        Method declaredMethod = aClass.getDeclaredMethod("greet", String.class);
        declaredMethod.setAccessible(true);
        try {
            String result = (String) declaredMethod.invoke(task1, "Hi");
            System.out.println(result);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
