package com.bank.agencies.usecase;

import com.bank.agencies.domain.Agency;
import com.bank.agencies.external.gateway.AgenciesGateway;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindAllBBAgenciesUseCase {

    private final AgenciesGateway bankResourcesGateway;

    public FindAllBBAgenciesUseCase(AgenciesGateway bankResourcesGateway) {
        this.bankResourcesGateway = bankResourcesGateway;
    }

    public List<Agency> execute() {
        return bankResourcesGateway.findAllBBAgencies();
    }
}
