package com.telran.practice.practice13;

//1. Создать набор классов для хранения геометрических фигур:
//прямоугольник, квадрат, круг, треугольник (пусть для простоты будет только прямоугольный)
//2. Реализовать методы equals() и hashcode() у них.
//3. Составить TreeSet и HashSet из геометрических фигур
//4. Добавить метод вычисления площади фигур.
//5. Составить список из разных геометрических фигур и отсортировать его по площади

import java.util.HashSet;
import java.util.TreeSet;

public class FigureApp {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 4);
        Square square = new Square(4);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(3, 5);

        HashSet<Rectangle> hashSetRectangle = new HashSet<>();
        hashSetRectangle.add(rectangle);
        hashSetRectangle.add(square);

        System.out.println(hashSetRectangle);

        TreeSet<Rectangle> treeSet = new TreeSet<>();
        treeSet.add(rectangle);
        treeSet.add(square);

        System.out.println(treeSet);
    }
}