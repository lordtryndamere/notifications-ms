package com.liondevs.notificationsmsconsumer.service;



import com.liondevs.notificationsmsconsumer.events.OrderCreatedEvent;
import com.liondevs.notificationsmsconsumer.persistence.models.Notifications;
import com.liondevs.notificationsmsconsumer.persistence.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.modelmapper.TypeToken;
import org.modelmapper.ModelMapper;
import java.lang.reflect.Type;


@Component
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository repository;

    public void  save(OrderCreatedEvent event){
        Type objectType = new TypeToken<Notifications<Object>>() {}.getType();
        Notifications<Object> returnValue = new ModelMapper().map(event, objectType);
        returnValue.setCreatedAt(event.getDate());
        returnValue.setData(event.getData());
        repository.save(returnValue).subscribe();
    }
}

