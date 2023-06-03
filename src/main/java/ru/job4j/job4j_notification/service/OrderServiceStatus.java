package ru.job4j.job4j_notification.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceStatus {

    @KafkaListener(topics = "dishStatus")
    public void receiveOrder(String status) {
        System.out.println(status);
    }
}
