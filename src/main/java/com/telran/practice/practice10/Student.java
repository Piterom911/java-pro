package com.telran.practice.practice10;

import java.util.Comparator;

/**
 * 1. Создать класс Student с полями name, surname. Определить порядок студентов через Comparable (natural ordering)
 * с учетом всех полей. Создать компараторы по отдельным полям name, surname.
 * Составить список студентов. Вывести отсортированный список студентов через Comparable и два компаратора.
 * Составить TreeSet из исходного списка студентов.
 */

public class Student implements Comparable<Student>{
    private String name;

    private String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int compareTo(Student o) {
        int i = surname.compareTo(o.getSurname());
        if (i == 0) {
            return name.compareTo(o.getName());
        }
        return i;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    static class CompareByName implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    static class CompareBySurname implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getSurname().compareTo(o2.getSurname());
        }
    }
}
