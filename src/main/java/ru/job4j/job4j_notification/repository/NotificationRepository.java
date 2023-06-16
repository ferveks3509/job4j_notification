package ru.job4j.job4j_notification.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.job4j_notification.model.Notification;

public interface NotificationRepository extends CrudRepository<Notification, Integer> {
}
