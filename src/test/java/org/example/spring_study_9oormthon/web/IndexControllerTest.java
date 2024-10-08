package org.example.spring_study_9oormthon.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class IndexControllerTest {
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void mainPageLoading() {
		//when
		String body = this.restTemplate.getForObject("/", String.class);

		//then
		assertThat(body).contains("스프링부트로 시작하는 웹 서비스");

	}
}