package com.system.design.low.level.design.pattern.bridgedp.service.impl;

import com.system.design.low.level.design.pattern.bridgedp.service.Notification;
import com.system.design.low.level.design.pattern.bridgedp.service.NotificationSender;

public class EmailNotificationSender implements NotificationSender {

	@Override
	public void sendMessage() {
		System.out.println("Email Notification is send !!");
		
	}

	
}
