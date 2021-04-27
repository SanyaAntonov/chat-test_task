package ru.antonov.chat.model;

import java.time.LocalDateTime;

public class Message {
    private String name;
    private String text;
    private LocalDateTime date;

    public Message(String name, String text, LocalDateTime date) {
        this.name = name;
        this.text = text;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setLocalDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", localDate=" + date +
                '}';
    }
}
