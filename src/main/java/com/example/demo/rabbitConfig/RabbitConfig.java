package com.example.demo.rabbitConfig;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig
{
    public static final String QUEUE_ORDERS = "contract-queue";
    public static final String EXCHANGE_ORDERS = "contract-exchange";

    @Bean
    Queue ordersQueue() {
        return QueueBuilder.durable(QUEUE_ORDERS).build();
    }

    @Bean
    Exchange ordersExchange() {
        return ExchangeBuilder.topicExchange(EXCHANGE_ORDERS).build();
    }

    @Bean
    Binding binding(Queue ordersQueue, TopicExchange contractExchange) {
        return BindingBuilder.bind(ordersQueue).to(contractExchange).with(QUEUE_ORDERS);
    }
}