package com.jknyou.rabbit.service;

public interface RabbitMqService {
	void convertAndSend(String queue, String data);
	Object receiveAndConvert(String queue);

}
