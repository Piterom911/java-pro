package com.telran.practice.practice13;

import java.util.Objects;

public class Rectangle implements Comparable<Rectangle>, AbilityToFindArea {

    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(length, rectangle.length) == 0 && Double.compare(height, rectangle.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, height);
    }

    @Override
    public double findArea() {
        return length * height;
    }

    @Override
    public int compareTo(Rectangle o) {
        int isLengthEquals = Double.compare(length, o.length);
        if (isLengthEquals == 0) {
            return Double.compare(height, o.height);
        }
        return isLengthEquals;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", height=" + height +
                ", area=" + findArea() +
                '}';
    }
}
