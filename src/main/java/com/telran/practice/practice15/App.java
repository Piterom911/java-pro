package com.telran.practice.practice15;

// 1. Создать Consumer, который принимает числа и печатает четные числа в поток System.out, а нечетные числа в System.err.
// 2. Создать BiFunction, которая возводит первый аргумент типа int в степень второго аргумента типа int
// 3. Создать Supplier randomJoke, который выдает пользователю случайный анекдот из заготовленного исходного списка анекдотов.
// 4. Создать Predicate isYellowMonkey, который проверяет, желтого ли цвета обезьянка Monkey.

// 5. Написать метод, который на вход принимает два массива одинакового размера типа Integer и функцию.
// Метод возвращает массив, в котором хранятся результаты попарных вычислений согласно переданной функции.

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class App {

    public static void main(String[] args) {
        Integer[] arr1 = {2, 7, 3, 9, 4, 0, 1, 7, 55, 3, 22, 77, 44};
        Integer[] arr2 = {22, 6, 3, 86, 3236, 8, 344, 35, 85, 33, 5, 34, 1};
        BinaryOperator<Integer> mul = (num1, num2) -> num1 * num2;

        Integer[] result = doMath(arr1, arr2, mul);
        System.out.println(Arrays.toString(result));
    }

    private static Integer[] doMath(Integer[] arr1, Integer[] arr2, BinaryOperator<Integer> func) {
        Integer[] result = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            int res = func.apply(arr1[i], arr2[i]);
            result[i] = res;
        }
        return result;
    }
}
