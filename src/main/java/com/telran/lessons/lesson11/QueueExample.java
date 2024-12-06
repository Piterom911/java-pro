package com.telran.lessons.lesson11;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> strings = new LinkedList<>();

        // offer() - adds elem
        strings.offer("Java");
        strings.offer("Hello");

        // peek(elem) - returns, but not delete
        System.out.println(strings.peek());

        // pool() - returns elem and deletes it from the queue
        System.out.println(strings.poll());
        System.out.println(strings.peek());
    }
}
