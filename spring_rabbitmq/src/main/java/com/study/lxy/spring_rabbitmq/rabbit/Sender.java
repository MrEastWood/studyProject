package com.study.lxy.spring_rabbitmq.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	public void send(int i) {
		
		String content = "message " + i;
		System.out.println("send content : " + content);
		
		this.rabbitTemplate.convertAndSend("hello",content);
		
	}
	
	
}
