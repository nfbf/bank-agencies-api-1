package com.bank.agencies.usecase;

import com.bank.agencies.domain.AgencyGatewayResponse;
import com.bank.agencies.external.gateway.AgenciesGateway;
import com.bank.agencies.fixture.AgenciesFixture;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class FindAllBBAgenciesUseCaseTest {

    final AgenciesGateway gateway = mock(AgenciesGateway.class);
    final FindAllBBAgenciesUseCase findAllBBAgencies = new FindAllBBAgenciesUseCase(gateway);

    List<AgencyGatewayResponse> agencies;

    @Test
    void shouldExecuteUseCaseFindAllBBAgenciesWithSuccess() {
        // given
        agencies = AgenciesFixture.gimmeBasicBBAgencies();
        when(findAllBBAgencies.execute()).thenReturn(agencies);

        // when
        final List<AgencyGatewayResponse> response = findAllBBAgencies.execute();

        // then
        verify(gateway, times(1)).findAllBBAgencies();

        assertNotNull(response);
        assertNotNull(response.get(0));
    }
}
