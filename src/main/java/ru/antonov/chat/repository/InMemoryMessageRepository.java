package ru.antonov.chat.repository;

import org.springframework.stereotype.Repository;
import ru.antonov.chat.model.Message;

import java.util.ArrayList;
import java.util.List;


@Repository
public class InMemoryMessageRepository {

    static List<Message> messageRepository = new ArrayList<>();

    public void createMessage(Message message) {
        messageRepository.add(message);
    }

    public List<Message> getAll() {
        return messageRepository;
    }
}
