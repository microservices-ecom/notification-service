package com.ecom.notification.controller;


import com.ecom.notification.dto.NotificationRequest;
import com.ecom.notification.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notifications")
@RequiredArgsConstructor
public class NotificationController {

	private final NotificationService notificationService;

	@PostMapping
	public String send(@RequestBody NotificationRequest req) {
		notificationService.sendNotification(req);
		return "Notification initiated";
	}
}
