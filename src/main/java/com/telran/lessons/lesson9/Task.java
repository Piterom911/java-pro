package com.telran.lessons.lesson9;

import java.util.HashSet;
import java.util.Set;

public class Task {

    public static void main(String[] args) {
        String text = ":Df;F;DjudhfjdDSfuhDSf;oohgeoW{ERAJoapiei)*(8r9488(*%*(&%^(8dpruhguuIUgregih";
        Set<Character> charsSet = new HashSet<>();

        char[] chars = text.toCharArray();
        for (char aChar : chars) {
            charsSet.add(aChar);
        }
        System.out.println(charsSet);
        charsSet.forEach(value -> System.out.println("Hashcode for " + value + " -> " + value.hashCode()));
    }
}
