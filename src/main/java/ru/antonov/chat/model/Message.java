package ru.antonov.chat.model;

import java.time.LocalDate;

public class Message {
    private String name;
    private String text;
    private LocalDate localDate;

    public Message(String name, String text, LocalDate localDate) {
        this.name = name;
        this.text = text;
        this.localDate = localDate;
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

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Message{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", localDate=" + localDate +
                '}';
    }
}
