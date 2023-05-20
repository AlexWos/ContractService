package com.example.demo.contractSend;


import com.example.demo.rabbitConfig.RabbitConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.demo.contractservice.CreateNewContractRequest;


@Service
public class ContractSend {
    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public ContractSend(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendContract(CreateNewContractRequest contract) {
        this.rabbitTemplate.convertAndSend(RabbitConfig.QUEUE_ORDERS, contract);
    }
}