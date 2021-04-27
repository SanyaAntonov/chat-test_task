package ru.antonov.chat.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import ru.antonov.chat.model.Message;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
@Scope("prototype")
public class InMemoryMessageRepository {

    static List<Message> messageRepository = new ArrayList<>();

    public void createMessage(Message message) {
        messageRepository.add(message);
    }

    public List<Message> getAll() {
        return messageRepository.stream()
                .filter(message -> message.getLocalDate().equals(LocalDate.now()))
                .collect(Collectors.toList());
    }
}
