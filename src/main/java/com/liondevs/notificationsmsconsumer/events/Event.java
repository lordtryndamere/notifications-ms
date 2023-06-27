package com.liondevs.notificationsmsconsumer.events;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@ToString
public class Event <T> {
    private String id;
    private LocalDateTime date;

    private String from;
    private EventType type;
    private T data;
}
