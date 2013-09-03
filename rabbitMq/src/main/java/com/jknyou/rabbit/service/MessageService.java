package com.jknyou.rabbit.service;

public interface MessageService {
	void pushMessage(String message);
	Object popMessage();
}
