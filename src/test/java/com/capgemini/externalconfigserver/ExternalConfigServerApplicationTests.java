package com.capgemini.externalconfigserver;

import com.capgemini.externalconfigserver.controller.HealthCheckControllerImplementation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ExternalConfigServerApplicationTests {

	@Autowired HealthCheckControllerImplementation controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}