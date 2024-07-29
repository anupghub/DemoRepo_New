package com.APITraining_Module_1;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;

import java.io.File;

public class schemaValidation {
	
	@Test
	public void schemaJsonValidation() {
		
		//File file = new File("./src/test/resources/schemaVal/JsonSchemaValidation.JSON");
		
		File file = new File(System.getProperty("user.dir")+"/src/test/resources/schemaVal/JsonSchemaValidation.JSON");
		//FileNotFoundException (Checked Exception/Compile time error)
		
		given().contentType(ContentType.JSON).when().get("https://reqres.in/api/users?page=2").then()
		.body(JsonSchemaValidator.matchesJsonSchema(file));
	}

}
