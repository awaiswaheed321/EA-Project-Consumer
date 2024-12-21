package edu.miu.ea.awais.eaprojectconsumer.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public ResponseEntity<List<Message>> getMessages() {
        return ResponseEntity.ok(messageRepository.findAll());
    }

    public void saveMessage(Message message) {
        messageRepository.save(message);
    }
}
