package com.telran.lessons.lesson11;

import java.util.Stack;

public class TaskExample {

    public static void main(String[] args) {
        // 1 example: kbceffecbh
        // 2 example: Soliter
        // 3 example: Calculator

        Stack<Character> characters = new Stack<>();
        String str = "kbceffecbh";
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (characters.isEmpty()) {
                characters.push(ch);
            } else {
                if (characters.peek() == ch) {
                    characters.pop();
                } else {
                    characters.push(ch);
                }
            }
        }
        System.out.println(characters);
    }
}
