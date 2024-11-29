package com.telran.summary.summary7.broker;

import java.util.UUID;

public class Message {

    private String text;

    private UUID id;

    public Message(String text) {
        this.text = text;
        this.id = UUID.randomUUID();
    }

    public String getText() {
        return text;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                ", id=" + id +
                '}';
    }
}
