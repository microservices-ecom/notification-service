package com.ecom.notification.dto;


public record NotificationRequest(
    Long userId,
    String subject,
    String message,
    String channel
) {}
