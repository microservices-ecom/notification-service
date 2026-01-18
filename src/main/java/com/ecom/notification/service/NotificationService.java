package com.ecom.notification.service;


import com.ecom.notification.dto.NotificationRequest;

public interface NotificationService {
	void sendNotification(NotificationRequest request);
}
