package com.system.design.low.level.design.pattern.bridgedp;

import com.system.design.low.level.design.pattern.bridgedp.service.impl.EmailNotificationSender;
import com.system.design.low.level.design.pattern.bridgedp.service.impl.JsonMessage;
import com.system.design.low.level.design.pattern.bridgedp.service.impl.SmsNotificationSender;
import com.system.design.low.level.design.pattern.bridgedp.service.impl.TextMessage;

public class BridgeDesignPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextMessage emailtxt = new TextMessage(new EmailNotificationSender());
		emailtxt.sendNotification();
		
		TextMessage smstxt = new TextMessage(new SmsNotificationSender());
		smstxt.sendNotification();
		
		JsonMessage emailjson = new JsonMessage(new EmailNotificationSender());
		emailjson.sendNotification();
		
		JsonMessage smsjson = new JsonMessage(new SmsNotificationSender());
		smsjson.sendNotification();

	}

}
