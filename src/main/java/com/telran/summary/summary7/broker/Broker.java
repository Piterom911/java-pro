package com.telran.summary.summary7.broker;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<Message> messages = new ArrayList<>();

    public void addMessage(Message message) {
        this.messages.addFirst(message);
    }

    public Message getMessage() {
        return this.messages.remove(messages.size() - 1);
    }

    public boolean isEmpty() {
        return messages.isEmpty();
    }
}
