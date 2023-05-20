package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ru.demo.contractservice.CreateNewContractRequest;
import ru.demo.contractservice.CreateNewContractResponse;

@Endpoint
public class ContractServiceEnd {

    private static final String NAMESPACE_URI = "http://demo.ru/ContractService/";

    private ContractService contractService;

    @Autowired
    public ContractServiceEnd(ContractService contractService) {
        this.contractService = contractService;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getContractRequest")
    @ResponsePayload
    public CreateNewContractResponse getContract(@RequestPayload CreateNewContractRequest request) {

        return ;
    }

}
