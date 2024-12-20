package edu.miu.ea.awais.eaprojectconsumer.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class Consumer {
    @JmsListener(destination = "${queue.name}")
    public void receiveMessage(Map<String, ?> map) {
        Message message = Message.fromMap(map);
        System.out.println("Ticket Confirmation: " + message);
    }
}
