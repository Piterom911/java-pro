package com.telran.practice.practice13;

import java.util.Objects;

public class Circle implements AbilityToFindArea {

    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        this.area = findArea();
    }

    public double getArea() {
        return area;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }

    @Override
    public double findArea() {
        return Math.PI * (radius * radius);
    }
}
