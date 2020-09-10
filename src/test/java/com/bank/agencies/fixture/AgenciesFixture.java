package com.bank.agencies.fixture;

import com.bank.agencies.domain.Agency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AgenciesFixture {

    public static List<Agency> gimmeBasicBBAgencies() {
        return List.of(Agency.AgencyBuilder.anAgency().bank("BANCO DO BRASIL S.A.").name("EMPRESA JOAO PESSOA").city("JOAO PESSOA").state("PB").build());
    }
}
