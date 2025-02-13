package com.telran.lessons.lesson26.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GreetingsApp {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Greetings greetings = new Greetings();
        Class<? extends Greetings> aClass = greetings.getClass();
        Annotation[] annotations = aClass.getAnnotations();
        System.out.println(Arrays.asList(annotations));

        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            Annotation[] annotations1 = field.getAnnotations();
            System.out.println("Field " + field.getName() + " " + Arrays.toString(annotations1));
        }

        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            Annotation[] annotations1 = method.getAnnotations();
            System.out.println("Field " + method.getName() + " " + Arrays.toString(annotations1));
            if (method.isAnnotationPresent(HelloAnnotation.class)) {
                method.setAccessible(true);
                method.invoke(greetings, "Alex");
            }
        }
    }
}
