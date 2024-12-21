package edu.miu.ea.awais.eaprojectconsumer.message;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Map;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long emId;
    private Long eventId;
    private String eventName;
    private Long ticketId;
    private Long customerId;
    private String customerEmail;

    public Message() {
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
                "id=" + emId +
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

    public long getId() {
        return emId;
    }
}
