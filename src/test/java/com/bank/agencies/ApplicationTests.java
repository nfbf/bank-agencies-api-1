package com.bank.agencies;

import com.bank.agencies.domain.Agency;
import com.bank.agencies.usecase.FindAllBBAgenciesUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class ApplicationTests {

	@Autowired
	private FindAllBBAgenciesUseCase useCase;

	@Test
	void contextLoads() {
	}

	@Test
	void loadWithSuccess() {
		List<Agency> agencies = useCase.execute();
		Assertions.assertNotNull(agencies);
		Assertions.assertTrue(agencies.stream().allMatch(agency -> agency.getBank().equalsIgnoreCase("BANCO DO BRASIL S.A.")));
	}

}
