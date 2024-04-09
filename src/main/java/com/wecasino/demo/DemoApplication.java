package com.wecasino.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Argument;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner  {

	private static final Logger logger = 
    LoggerFactory.getLogger(DemoApplication.class);

	private static final String WECA_QUEUE = "yx-uat";
	private static final String WECA_EXCHANGE = "game-exchange";

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

	@RabbitListener(
		bindings = @QueueBinding(
			value = @Queue(value = WECA_QUEUE, durable = "false", autoDelete = "true", exclusive = "false"),
			exchange = @Exchange(value = WECA_EXCHANGE, autoDelete = "false"),
			arguments = {
					@Argument(name = "x-match", value = "any"),
					@Argument(name = "platform", value = "true")
			}),
		ackMode = "manual"	
	)

	public void listen(Message msg) {

		if (msg.getMessageProperties().getType().equals(in))

		System.out.println("Message read from myQueue : " + msg);
	}



}
