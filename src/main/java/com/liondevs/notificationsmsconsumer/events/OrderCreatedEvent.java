package com.liondevs.notificationsmsconsumer.events;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;

@Data
@EqualsAndHashCode(callSuper = true)
public class OrderCreatedEvent extends Event<Object> {
    
}
