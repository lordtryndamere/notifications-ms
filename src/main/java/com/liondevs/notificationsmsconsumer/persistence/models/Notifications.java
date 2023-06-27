package com.liondevs.notificationsmsconsumer.persistence.models;

import com.liondevs.notificationsmsconsumer.events.EventType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "Notifications")
public class Notifications <T> {
    @Id
    private String id;

    private T data;

    private EventType type;

    private String from;

    private LocalDateTime createdAt;
}
