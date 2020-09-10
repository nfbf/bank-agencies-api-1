package com.bank.agencies.external.gateway;

import com.bank.agencies.domain.Agency;

import java.util.List;

public interface AgenciesGateway {
    List<Agency> findAllBBAgencies();
}
