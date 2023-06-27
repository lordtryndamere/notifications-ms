package com.liondevs.notificationsmsconsumer.persistence.repository;

import com.liondevs.notificationsmsconsumer.persistence.models.Notifications;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface NotificationRepository extends ReactiveMongoRepository<Notifications<Object>,String> {
}
