package edu.miu.ea.awais.eaprojectconsumer.jms;

import java.util.HashMap;
import java.util.Map;

public class Message {
    private Long eventId;
    private String eventName;
    private Long ticketId;
    private Long customerId;
    private String customerEmail;

    public Message() {
    }

    public Message(Long eventId, String eventName, Long ticketId, Long customerId, String customerEmail) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.ticketId = ticketId;
        this.customerId = customerId;
        this.customerEmail = customerEmail;
    }

    public static Message fromMap(Map<String, ?> map) {
        Message message = new Message();
        if (map.containsKey("eventId")) {
            message.setEventId((Long) map.get("eventId"));
        }
        if (map.containsKey("eventName")) {
            message.setEventName((String) map.get("eventName"));
        }
        if (map.containsKey("ticketId")) {
            message.setTicketId((Long) map.get("ticketId"));
        }
        if (map.containsKey("customerId")) {
            message.setCustomerId((Long) map.get("customerId"));
        }
        if (map.containsKey("customerEmail")) {
            message.setCustomerEmail((String) map.get("customerEmail"));
        }
        return message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", ticketId=" + ticketId +
                ", customerId=" + customerId +
                ", customerEmail='" + customerEmail + '\'' +
                '}';
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
