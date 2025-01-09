package com.telran.practice.practice16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        // 1. Отсортировать с помощью стримов список из строк
        // - по алфавиту
        // - в обратном порядке
        List<String> list = Arrays.asList("A", "D", "E", "M", "L", "O", "X", "C");

        List<String> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list " + collect);

        List<String> collect1 = list.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println("Reversed " + collect1);

        //2. Из списка чисел типа Integer с помощью стримов создать список их строковых представлений
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);


        List<Employee> employees = Arrays.asList(
                new Employee("Roman", "Dogoda", 35, 40),
                new Employee("Roman", "Dogoda", 35, 40),
                new Employee("Konstantin", "Sierikov", 35, 38),
                new Employee("Konstantin", "Sierikov", 35, 38),
                new Employee("Maksim", "Shchurovskiy", 24, 42),
                new Employee("Maksim", "Shchurovskiy", 24, 42),
                new Employee("Aleksandra", "Kriviz", 40, 25),
                new Employee("Aleksandra", "Kriviz", 40, 25),
                new Employee("Maria", "Familia", 17, 10),
                new Employee("Maria", "Familia", 17, 10),
                new Employee("John", "Johnson", 63, 50),
                new Employee("John", "Johnson", 63, 50),
                new Employee("Jake", "Jamison", 37, 25),
                new Employee("Jake", "Jamison", 37, 25)
        );

        employees.stream().filter(employee -> employee.getAge() > 20).forEach(System.out::println);
        System.out.println();

        employees.stream()
                .filter(employee -> employee.getWorkingHoursInMonth() > 30 && employee.getName().startsWith("J"))
                .forEach(System.out::println);
        System.out.println();

        employees.stream().
                filter(employee -> employee.getName().equals("John"))
                .forEach(employee -> System.out.println(employee.getSurname()));

        employees.stream()
                .distinct().forEach(System.out::println);

        List<String> collect2 = employees.stream().map(employee -> employee.getName()).distinct().collect(Collectors.toList());
        System.out.println(collect2);

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);


    }


}
// 4. Имеется два списка элементов.
//           List<Integer> list1 = Arrays.asList(1, 2, 3);
//           List<Integer> list2 = Arrays.asList(4, 5, 6);
//
//С помощью flatMap():
//a). Получить все возможные значения сумм чисел из обоих списков
//b). Получить все возможные комбинации пар чисел из обоих списков [1, 4] [2, 6]
//с). Найти все пары чисел, сумма которых будет равна заданному значению sum