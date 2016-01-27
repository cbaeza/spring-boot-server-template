package com.cbaeza.server.controller;

import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.MimeTypeUtils;

import com.cbaeza.server.Application;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.specification.RequestSpecification;

/**
 * using RestAssured
 * Created by cbaeza on 22/01/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class HelloControllerTest2 {

    public static final RequestSpecification getRequestSpecification() {
        RequestSpecification spec = new RequestSpecBuilder()
                .addHeader(HttpHeaders.ACCEPT, MimeTypeUtils.APPLICATION_JSON_VALUE)
                .build();
        return spec;
    }

    @Test
    public void test200() {
        given(getRequestSpecification())
                .get("/api/")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void test404() {
        given(getRequestSpecification())
                .get("/api/id/65454")
                .then()
                .assertThat()
                .statusCode(404);
    }
}
