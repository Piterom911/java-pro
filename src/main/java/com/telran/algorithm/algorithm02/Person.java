package com.telran.algorithm.algorithm02;

import java.util.Random;

public class Person {

    public Person getFamous(Person[] people) {
        int start = 0;
        int end = people.length - 1;
        while (start < end) {
            if (people[start].isKnown(people[end])) {
                start++;
            } else {
                end--;
            }
        }

        Person famousPerson = people[start];

        for (int i = 0; i < people.length; i++) {
            if (i != start) {
                if (!people[i].isKnown(famousPerson) || famousPerson.isKnown(people[i])) {
                    famousPerson = null;
                    break;
                }
            }
        }
        return famousPerson;
    }

    private boolean isKnown(Person person) {
        return false;
    }
}
