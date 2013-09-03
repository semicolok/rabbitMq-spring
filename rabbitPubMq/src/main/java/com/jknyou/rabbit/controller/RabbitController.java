package com.jknyou.rabbit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jknyou.rabbit.service.MessageService;

@Controller
public class RabbitController {
	
	@Autowired private MessageService messageService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(ModelMap model) {
		return "home";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public String convertAndSend(String data, ModelMap model) {
		messageService.pubData(data);
		return "jsonView";
	}
}
