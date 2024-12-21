package edu.miu.ea.awais.eaprojectconsumer.jms;

import edu.miu.ea.awais.eaprojectconsumer.message.Message;
import edu.miu.ea.awais.eaprojectconsumer.message.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class Consumer {
    private final MessageService messageService;

    @Autowired
    public Consumer(MessageService messageService) {
        this.messageService = messageService;
    }

    @JmsListener(destination = "${queue.name}")
    public void receiveMessage(Map<String, ?> map) {
        Message message = Message.fromMap(map);
        messageService.saveMessage(message);
        System.out.println("Ticket Confirmation: " + message);
    }
}
