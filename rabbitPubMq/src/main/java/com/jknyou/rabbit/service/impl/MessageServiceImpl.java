package com.jknyou.rabbit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.Message;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.jknyou.rabbit.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	@Qualifier("fanoutChannel")
	PublishSubscribeChannel messageChannel;

	@Override
	public void pubData(String data) {
		Message<String> message = MessageBuilder.withPayload(data).build();
		
		messageChannel.send(message);
		
	}

}
