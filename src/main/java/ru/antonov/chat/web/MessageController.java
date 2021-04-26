package ru.antonov.chat.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.antonov.chat.model.Message;
import ru.antonov.chat.repository.InMemoryMessageRepository;

import java.util.Map;

@Controller
public class MessageController {
    private final InMemoryMessageRepository repository;

    private String nickname = null;

    public MessageController(InMemoryMessageRepository repository) {
        this.repository = repository;
    }

    @GetMapping()
    public String greeting(Map<String, Object> model) {
        return "hello";
    }
    @PostMapping()
    public String sendNickName(@RequestParam(name = "name", required = true) String name,
                               Map<String, Object> model) {
        nickname = name;
        return get(model);
    }

    @GetMapping("/chat")
    public String get(Map<String, Object> model) {
        Iterable<Message> messages = repository.getAll();
        model.put("messages", messages);
        return "chat";
    }

    @PostMapping("/chat")
    public String add(@RequestParam String text,
                      Map<String, Object> model) {
        Message message = new Message(nickname, text);
        repository.createMessage(message);

        Iterable<Message> messages = repository.getAll();
        model.put("messages", messages);
        return "chat";
    }
}
