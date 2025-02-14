package com.telran.summary.summary26.task;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Order {

    private final Date date;

    private final int number;

    @Setter
    @Getter
    private Status status;

    public Order(Date date, int number, Status status) {
        this.date = date;
        this.number = number;
        this.status = status;
    }

}
