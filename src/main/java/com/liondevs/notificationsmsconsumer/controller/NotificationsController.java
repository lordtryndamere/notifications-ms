package com.liondevs.notificationsmsconsumer.controller;

import com.liondevs.notificationsmsconsumer.events.Event;
import com.liondevs.notificationsmsconsumer.events.OrderCreatedEvent;
import com.liondevs.notificationsmsconsumer.service.NotificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class NotificationsController {
    private final NotificationService service;

    @KafkaListener(
            topics = "orders-ms-notification",
            containerFactory = "kafkaListenerContainerFactory",
            groupId = "group-order-ms-notification")
    public void consumer(Event<?> event) {
        if (event.getClass().isAssignableFrom(OrderCreatedEvent.class)) {
            OrderCreatedEvent orderCreatedEvent = (OrderCreatedEvent) event;
            log.info("Received order created event .... with Id={}, data={}",
                    orderCreatedEvent.getId(),
                    orderCreatedEvent.getData().toString());
            service.save(orderCreatedEvent);

        }

    }

}
