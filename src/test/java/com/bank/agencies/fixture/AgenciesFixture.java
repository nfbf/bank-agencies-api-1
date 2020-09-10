package com.bank.agencies.fixture;

import com.bank.agencies.domain.AgencyGatewayResponse;

import java.util.List;

public class AgenciesFixture {

    public static List<AgencyGatewayResponse> gimmeBasicBBAgencies() {
        return List.of(AgencyGatewayResponse.AgencyGatewayResponseBuilder.anAgency().bank("BANCO DO BRASIL S.A.").name("EMPRESA JOAO PESSOA").city("JOAO PESSOA").state("PB").build());
    }
}
