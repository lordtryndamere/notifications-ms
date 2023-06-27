package com.liondevs.notificationsmsconsumer.config;

public class KafkaConsumerTrustedPackages {
    public static final String[] trustedPackages = {
            "com.liondevs.notificationsmsconsumer.events.Event",
            "com.liondevs.orders.ordersmsprod.event.OrderCreatedEvent",
            "com.liondevs.orders.ordersmsprod.event.Event",
            "com.liondevs.notificationsmsconsumer.events.OrderCreatedEvent"};
}
