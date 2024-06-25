package com.system.design.low.level.design.pattern.bridgedp.service;

public abstract class Notification {
	
	protected NotificationSender notificationsender;

	public Notification(NotificationSender notificationsender) {
		super();
		this.notificationsender = notificationsender;
	}
	
	public abstract void sendNotification();

}
