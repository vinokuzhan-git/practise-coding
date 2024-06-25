package com.system.design.low.level.design.pattern.bridgedp.service.impl;

import com.system.design.low.level.design.pattern.bridgedp.service.NotificationSender;

public class SmsNotificationSender implements NotificationSender 
{

	@Override
	public void sendMessage() {
		System.out.println("SMS Notification is send !!");
		
	}

}
