package com.jknyou.rabbit.service.impl;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jknyou.rabbit.service.RabbitMqService;

@Service
public class RabbitMqServiceImpl implements RabbitMqService {

	@Autowired private AmqpTemplate amqpTemplate;

	@Override
	public void convertAndSend(String queue, String data) {
		amqpTemplate.convertAndSend(queue, data);
	}

	@Override
	public Object receiveAndConvert(String queue) {
		return amqpTemplate.receiveAndConvert(queue);
	}
	
	
}
