package com.telran.summary.summary26;

import java.util.stream.Stream;

/**
 * NotEmpty(поле не является null или пустым
 * должен быть не обязательный параметр skip
 * В этом параметре должен быть enum, где мы укажем что пропускаем при валидации
 * 1. Аннотация NotEmpty
 * */

public class ValidatorApp {

    public static void main(String[] args) {
        Student studentOne = new Student("Max", "123odin@gmail.com", 46, "Address123");
        Student studentTwo = new Student(null, "123odin@gmail.com", 50, "Address999");
        Student studentThree = new Student("Oleg", "123two@gmail.com", 48, "");

        Validator validator = new Validator();
        Stream.of(studentOne, studentTwo, studentThree).forEach(student -> {

            try {
                validator.validate(student);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });
    }
}
