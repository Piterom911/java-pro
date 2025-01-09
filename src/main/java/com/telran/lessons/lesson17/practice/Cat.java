package com.telran.lessons.lesson17.practice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Cat {

    private String name;

    private int age;

    private boolean isHungry;

    private Color color;
}
