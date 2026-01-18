package com.ecom.notification.repository;

import com.ecom.notification.model.NotificationEntity;
import com.ecom.notification.enums.NotificationStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<NotificationEntity, Long> {
    List<NotificationEntity> findByStatus(NotificationStatus status);
}
