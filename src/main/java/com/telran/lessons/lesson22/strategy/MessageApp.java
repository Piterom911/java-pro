package com.telran.lessons.lesson22.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MessageApp {

    public static void main(String[] args) throws IOException {
        System.out.println("Input message: " );
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String message = bufferedReader.readLine();

        System.out.println("Select send method:\n1 -> Email\n2 -> SMS");
        int userChoice = Integer.parseInt(bufferedReader.readLine());
        SendStrategy strategy = null;
        switch (userChoice) {
            case 1 -> strategy = new EmailSendStrategy();
            case 2 -> strategy = new SmsSendStrategy();
        }

        strategy.send(message);
    }
}
