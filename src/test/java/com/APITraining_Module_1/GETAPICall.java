package com.APITraining_Module_1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETAPICall {
	
	@Test
	
	public void testAPIGETCall() {
		
		
		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath = "/api/users";
		
		RequestSpecification request = RestAssured.given();
		
		request.queryParam("page", 2);
		
		Response resp = request.get();
		System.out.println(resp.asString());
		
	
	}

}
