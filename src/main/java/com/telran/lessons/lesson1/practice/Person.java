package com.telran.lessons.lesson1.practice;

public class Person {

    private String name;

    private String surname;

    private int age;

    private String email;

    private Passport passport;

    public Person(String name, String surname, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }

    public Person(String name, String surname, int age, String email, Passport passport) {
        this(name, surname, age, email);
        this.passport = passport;
    }

    public String getInfo() {
        return "\nPerson name: " + this.name + "\nSurname: " + this.surname + "\nAge: " + this.age + "\nEmail: " + this.email;
    }

    public void printInfo() {
        System.out.println(this.getInfo());
    }

    public void showPassport() {
        System.out.println(this.passport);
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setAge(int age) {
        if (age < this.age || age > 60) return;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", passport=" + passport +
                '}';
    }
}
