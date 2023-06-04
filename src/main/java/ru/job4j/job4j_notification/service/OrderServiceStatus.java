package ru.job4j.job4j_notification.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.job4j.job4j_notification.model.Notification;

@Service
public class OrderServiceStatus {

    @KafkaListener(topics = "dishStatus")
    public void receiveOrder(Notification notification) {
        System.out.println(notification.getStatus());
    }
}
