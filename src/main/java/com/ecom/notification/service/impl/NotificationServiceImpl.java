package com.ecom.notification.service.impl;


import com.ecom.notification.dto.NotificationRequest;
import com.ecom.notification.enums.NotificationChannel;
import com.ecom.notification.enums.NotificationStatus;
import com.ecom.notification.model.NotificationEntity;
import com.ecom.notification.repository.NotificationRepository;
import com.ecom.notification.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {

	private final NotificationRepository repository;
	private final JavaMailSender mailSender;

	@Override
	public void sendNotification(NotificationRequest req) {
		NotificationEntity entity = NotificationEntity.builder().userId(req.userId()).subject(req.subject())
				.message(req.message()).status(NotificationStatus.PENDING)
				.channel(NotificationChannel.valueOf(req.channel())).build();

		repository.save(entity);

		// For resume demonstration
		System.out.println("Sending notification via: " + req.channel());

		entity.setStatus(NotificationStatus.SENT);
		repository.save(entity);
	}
}
