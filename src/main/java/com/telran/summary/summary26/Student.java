package com.telran.summary.summary26;

public class Student {

    @NotEmpty
    private final String name;

    @NotEmpty
    private final String email;

    private final int age;

    @NotEmpty(skip = Skip.EMPTY)
    private String address;

    public Student(String name, String email, int age, String address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
