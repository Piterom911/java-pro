package com.telran.practice.practice19.cloneable;

import java.util.Objects;

public class User implements Cloneable{

    private String name;

    private String surName;

    private int age;

    private Address address;

    public User(String name, String surName, int age, Address address) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.address = address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(surName, user.surName) && Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        User cloned = (User) super.clone();
        cloned.setAddress((Address) address.clone());
        return cloned;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("Tom", "Smith", 43, new Address("Schillerstrasse"));
        User cupy = (User) user.clone();
        System.out.println(cupy);
        System.out.println(user.address == cupy.address);
        System.out.println(user.equals(cupy));
    }


}
