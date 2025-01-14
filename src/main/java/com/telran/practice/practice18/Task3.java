package com.telran.practice.practice18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        // 3. Написать программу, которая дает пользователю арифметическую задачу со случайными числами и проверяет ответ
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        System.out.println(a + " + " + b + " = ?\n");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String answer = reader.readLine();
            int result = Integer.parseInt(answer);
            if (result == sum(a, b)) {
                System.out.println("Correct");
            } else {
                System.out.println("Incorrect");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}
