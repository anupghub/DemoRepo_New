package com.APITraining_Module_1;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTAPICall {

	@Test
	public void postAPICall() throws JSONException {

		RestAssured.baseURI = "https://reqres.in/api/users";
		RequestSpecification request = RestAssured.given();

		JSONObject requestParam = new JSONObject();
		requestParam.put("name", "morpheus");
		requestParam.put("job", "leader");

		request.body(requestParam.toString());

		request.header("Content-Type", "Application/JSON");

		Response response = request.post("/post");
		System.out.println(response.asString());

		String body = response.getBody().asString();
		JsonPath path = new JsonPath(body);// deserialization

		System.out.println("response :" + path.get("id"));

		int StatusCode = response.statusCode();
		System.out.println(StatusCode);
		Assert.assertEquals(StatusCode, 201);

	}

	@Test
	public void putAPICall() throws JSONException {

		RestAssured.baseURI = "https://reqres.in/api/users/2";
		RequestSpecification request = RestAssured.given();

		JSONObject requestParam = new JSONObject();
		requestParam.put("name", "morpheus");
		requestParam.put("job", "hero");

		//request.body(requestParam.toString());

		request.header("Content-Type", "Application/JSON");

		Response response = request.put("/put");
		System.out.println(response.asString());

		String body = response.getBody().asString();
		JsonPath path = new JsonPath(body);// deserialization

		// System.out.println("response :"+ path.get("id"));

		int StatusCode = response.statusCode();
		System.out.println(StatusCode);
		Assert.assertEquals(StatusCode, 200);
	}

}
