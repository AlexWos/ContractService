package com.example.demo.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.List;
import java.util.UUID;

public class Contract implements Serializable {
    private UUID id;
    private DateFormat dateStart;
    private DateFormat dateEnd;
    private DateFormat dateSend;
    private DateFormat dateCreate;
    private int contractNumber;
    private String contractName;
    private long clientApi;
    private List<ContractualParty> contractual_parties;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public DateFormat getDateStart() {
        return dateStart;
    }

    public void setDateStart(DateFormat dateStart) {
        this.dateStart = dateStart;
    }

    public DateFormat getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(DateFormat dateEnd) {
        this.dateEnd = dateEnd;
    }

    public DateFormat getDateSend() {
        return dateSend;
    }

    public void setDateSend(DateFormat dateSend) {
        this.dateSend = dateSend;
    }

    public DateFormat getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(DateFormat dateCreate) {
        this.dateCreate = dateCreate;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public long getClientApi() {
        return clientApi;
    }

    public void setClientApi(long clientApi) {
        this.clientApi = clientApi;
    }

    public List<ContractualParty> getContractual_parties() {
        return contractual_parties;
    }

    public void setContractual_parties(List<ContractualParty> contractual_parties) {
        this.contractual_parties = contractual_parties;
    }
}
