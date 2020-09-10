package com.bank.agencies.endpoint;

import com.bank.agencies.Application;
import com.bank.agencies.domain.Agency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(classes = { Application.class }, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AgenciesControllerIntegrationTest {

	private static final String API_BASE_URL = "/agencies";

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void shouldReturnOKWhenDoAGetRequest() {
		ResponseEntity<Agency[]> responseEntity = restTemplate.getForEntity(API_BASE_URL, Agency[].class);

		Assertions.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
		Assertions.assertTrue(responseEntity.getBody().length > 0);
	}

}
