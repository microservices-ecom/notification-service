package com.ecom.notification.model;

import com.ecom.notification.enums.NotificationStatus;
import com.ecom.notification.enums.NotificationChannel;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NotificationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long userId;
	private String subject;

	@Column(columnDefinition = "TEXT")
	private String message;

	@Enumerated(EnumType.STRING)
	private NotificationChannel channel;

	@Enumerated(EnumType.STRING)
	private NotificationStatus status;

	private int retryCount = 0;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}
