package com.telran.lessons.lesson22.mvc.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Coffee extends Product {

    private final String title;
}
