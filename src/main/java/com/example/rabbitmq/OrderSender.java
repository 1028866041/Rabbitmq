package com.example.rabbitmq;

/**
 * Created by Administrator on 2018/9/13 0013.
 */

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/sendmessage")
    public void sendOrder(Order order) throws Exception {

        //new Thread(()->{
            CorrelationData correlationData = new CorrelationData();
            correlationData.setId(order.getMessageId());
            rabbitTemplate.convertAndSend("order-exchange", "order.xyz", order, correlationData);
        //}).start();
    }
}
