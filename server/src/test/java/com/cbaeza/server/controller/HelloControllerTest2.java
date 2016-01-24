package com.cbaeza.server.controller;

import com.cbaeza.server.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static com.jayway.restassured.RestAssured.*;

/**
 * using RestAssured
 * Created by cbaeza on 22/01/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class HelloControllerTest2 {

	@Test
	public void test200(){
		get("/api").then().assertThat().statusCode(200);
	}

	@Test
	public void test404() {
		get("/api/id/65454").then().assertThat().statusCode(404);
	}
}
