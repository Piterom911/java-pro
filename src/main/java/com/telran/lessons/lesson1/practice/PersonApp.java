package com.telran.lessons.lesson1.practice;

public class PersonApp {

    public static void main(String[] args) {
        Person one = new Person("Alex", "Alexeev", 32, "alexeev@gmail.com");
        Person two = new Person("Max", "Maximov", 23, "maximov@gmail.com");

        Passport passportOne = new Passport("13412341234", "2020-10-04", "2030-10-04");
        Passport passportTwo = new Passport("56734585675", "2017-07-02", "2027-07-02");

        Passport passportThree = new Passport("09867788979374", "2017-07-02", "2027-07-02");
        Person three = new Person("John", "Johnson", 43, "johnson@gmail.com", passportThree);

        one.setPassport(passportOne);
        two.setPassport(passportTwo);

        Person[] people = {one, two};

        for (Person person : people) {
            person.printInfo();
        }

        one.setAge(54);
        one.printInfo();
    }
}
