package com.telran.practice.practice26;

public class Task1 {
    private String greet(String greeting){
        return "Hello " + greeting;
    }
}

// 1. Создать приватный метод в классе. Вызвать его через рефлексию.
//2. Создать экземпляр класса lesson20241126.CustomArrayList через рефлексию.
//3. Имеется класс Student с полями name, surname, age.
//Создать аннотацию @StudentInfo чтобы с ее помощью иметь возможность инициализировать переменные типа Student.
//
//public class School {
//    @StudentInfo(name = "Tom", surname = "Smith", age = 15)
//    private Student student1;
//
//    @StudentInfo(name = "Mary", surname = "Jennings", age = 17)
//    private Student student2;
//}
//Создать экземпляр класса school и вставить в его поля значения, извлеченные из аннотации.
