package com.telran.practice.practice13;

public class Square extends Rectangle {

    public Square(double length) {
        super(length, length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + this.getLength() +
                ", height=" + this.getLength() +
                ", area=" + super.findArea() +
                '}';
    }
}
