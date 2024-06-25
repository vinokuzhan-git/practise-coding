package com.system.design.low.level.design.pattern.bridgedp.service.impl;

import com.system.design.low.level.design.pattern.bridgedp.service.Notification;
import com.system.design.low.level.design.pattern.bridgedp.service.NotificationSender;

public class TextMessage extends Notification {
	
	public TextMessage(NotificationSender notificationsender) {
		super(notificationsender);
		// TODO Auto-generated constructor stub
		System.out.println("Text Message is Ready to send");
	}

	@Override
	public void sendNotification() {
		// TODO Auto-generated method stub
		System.out.println("Send Text Message !!");
		notificationsender.sendMessage();
		
		
		
	}

}
