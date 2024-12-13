package com.telran.practice.practice13;

import java.util.Objects;

public class Triangle implements AbilityToFindArea {

    private double sideA;
    private double sideB;
    private double area;

    public Triangle(double height, double side) {
        this.sideA = height;
        this.sideB = side;
        this.area = findArea();
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(sideA, triangle.sideA) == 0 && Double.compare(sideB, triangle.sideB) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }

    @Override
    public double findArea() {
        return sideA * sideB / 2;
    }
}
