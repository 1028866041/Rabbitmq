package com.example.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class RabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqApplication.class, args);

		OrderSender orderSender = new OrderSender();
		Order order= new Order();
		order.setId("20180913");
		order.setName("rabbitmq");
		order.setMessageId(System.currentTimeMillis()+"$"+ UUID.randomUUID().toString());

		try {
			orderSender.sendOrder(order);
		}catch (Exception e){
			e.printStackTrace();
		}

	}
}
