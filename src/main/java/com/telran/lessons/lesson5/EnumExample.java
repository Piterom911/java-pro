package com.telran.lessons.lesson5;

public class EnumExample {

    public static void main(String[] args) {
        for (Season season: Season.values()) {
            System.out.println(season + " ");
            System.out.println("The season starts with " + season.getFirstMonth() + ". " + season.getDescription() + " \n");
        }
    }
}
