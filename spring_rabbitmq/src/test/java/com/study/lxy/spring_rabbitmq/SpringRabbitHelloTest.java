package com.study.lxy.spring_rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.lxy.spring_rabbitmq.rabbit.Sender;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringRabbitmqApplication.class)
public class SpringRabbitHelloTest {
	
	@Autowired
	private Sender sender;
	
	@Test
	public void hello() throws InterruptedException {
		for(int i = 0; i < 10000 ;i++) {
			sender.send(i);
		}
	}

}
