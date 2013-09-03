package com.jknyou.rabbit.service;


import org.springframework.integration.message.GenericMessage;

public class SubscriberServiceActivator {


	public void disPlay(GenericMessage<?> msg) throws Exception {
		String text = msg.toString();
		System.out.println("### PAYLOAD ###" + text);
	}
}
