package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class ContractServiceEnd {

    private static final String NAMESPACE_URI = "http://demo.ru/ContractService/";

    private ContractServiceStart contractService;

    @Autowired
    public ContractServiceEnd(ContractServiceStart contractService) {
        this.contractService = contractService;
    }

}
