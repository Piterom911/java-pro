package com.telran.summary.sammary7.broker;

import java.util.ArrayList;
import java.util.List;

public class Messenger {

    public static void main(String[] args) {
        List<Message> messages = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            messages.add(new Message("Text #" + i));
        }

        Broker broker = new Broker();

        int currentId = 0;
        int countAdd = 0;
        int countRemove = 0;

        while (true) {
            if (countAdd < 5) {
                broker.addMessage(messages.get(currentId++));
            }

            if (broker.isEmpty()) {break;}

            if (countAdd % 5 == 0 && currentId < messages.size()) {
                broker.addMessage(messages.get(currentId++));
            }
            countAdd++;

            if (countRemove % 10 == 0) {
                System.out.println(broker.getMessage());
            }
            countRemove++;
        }
    }
}
