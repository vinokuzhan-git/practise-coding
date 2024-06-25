package com.system.design.low.level.design.pattern.bridgedp.service.impl;

import com.system.design.low.level.design.pattern.bridgedp.service.Notification;
import com.system.design.low.level.design.pattern.bridgedp.service.NotificationSender;

public class JsonMessage extends Notification {

	public JsonMessage(NotificationSender notificationsender) {
		super(notificationsender);
		System.out.println("JSON Message is Ready to send");
	}

	@Override
	public void sendNotification() {
		// TODO Auto-generated method stub
				System.out.println("Send JSON Message !!");
				notificationsender.sendMessage();
		
	}

}
