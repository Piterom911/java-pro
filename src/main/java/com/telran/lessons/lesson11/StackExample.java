package com.telran.lessons.lesson11;

import java.util.Stack;

public class StackExample {


    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // push -> adds elem to the top of the stack
        stack.push("Hello");
        stack.push("Java");
        stack.push("Class");

        // peek -> shows the first elem of the stack
        System.out.println("Peek " + stack.peek());
        System.out.println("Peek " + stack.peek());

        // pop -> gets the first elem and deletes it from the top of the stack
        String topElem = stack.pop();
        System.out.println("Pop " + topElem);
        System.out.println("Peek " + stack.peek());

        System.out.println("Pop " + stack.pop());
        if (!stack.isEmpty()) {
            System.out.println("Pop " + stack.pop());
        }
    }
}
