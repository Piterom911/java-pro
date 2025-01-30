package com.telran.lessons.lesson22.builder;

import lombok.Builder;

@Builder
public class Student {

    private String name;

    private  String surname;

    private int age;

    private String email;

    private String address;

    private String rate;

    private long id;

    private String phone;

    public Student(String name, String surname, int age, String email, String address, String rate, long id, String phone) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.address = address;
        this.rate = rate;
        this.id = id;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", rate='" + rate + '\'' +
                ", id=" + id +
                ", phone='" + phone + '\'' +
                '}';
    }
}
