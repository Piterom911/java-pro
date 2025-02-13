package com.telran.lessons.lesson26.annotation;

import java.util.Date;

public class AnnotationApp {

    public static void main(String[] args) {
        // @Override — показывающая переопределения
        // @Deprecated — устаревший функционал, не рекомендуется использовать
            Integer a = Integer.valueOf(5);
        // @SuppressWarnings() — подовляет сообщения компилятора
        // @FunctionalInterface — указывает на функциональный интерфейс
    }

    @SuppressWarnings("deprication")
    public void printHello() {
        Date date = new Date(2025, 10, 01);
        System.out.println("Hello");
    }
}
