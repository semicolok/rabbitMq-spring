package com.jknyou.rabbit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jknyou.rabbit.service.MessageService;
import com.jknyou.rabbit.service.RabbitMqService;

@Service
public class MessageServiceImpl implements MessageService {

	private final static String queue= "rabbit.queue";
	
	@Autowired private RabbitMqService rabbitMqService;
	
	@Override
	public void pushMessage(String message) {
		rabbitMqService.convertAndSend(queue, message);
	}

	@Override
	public Object popMessage() {
		return rabbitMqService.receiveAndConvert(queue);
	}

}
