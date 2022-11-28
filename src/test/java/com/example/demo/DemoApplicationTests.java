package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

	@Autowired
  	private WebTestClient webTestClient;

	@Test
	void contextLoads() {
		Boolean contextLoaded = true;
		Assertions.assertThat(contextLoaded).isTrue();
	}

	@Test
  	public void testHello() {
		webTestClient.get().uri("/balance")
		.accept(MediaType.APPLICATION_JSON)
		.exchange().expectStatus().isOk()
		.expectBody(BalanceSheet.class).value(balanceSheet -> {
		assertThat(balanceSheet.getClosingBalance()).isEqualTo(600l);
		});
  	}

}
