package createPayload;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import createPayload.Employee;

public class createNestedJsonObject {

	public static void main(String[] args) throws JsonProcessingException {
		
		Employee employee = new Employee();
	
		employee.setFirstName("Anup");
		employee.setLastName("Kumar");
		employee.setProfession("AT");
		
		Address address = new Address();
		
		address.setCity("Pune");
		address.setCountry("India");
		address.setFlatNumber("F306");
		address.setSociety("Gera");
		address.setState("Maha");
		
		Address address2 = new Address();
		address2.setCity("Pune");
		address2.setCountry("India");
		address2.setFlatNumber("F305");
		address2.setSociety("Riverdale");
		address2.setState("Maha");
		
		List<Address> alladdress = new ArrayList<>();
		alladdress.add(address2);
		alladdress.add(address);
		
		employee.setAddress(alladdress);
		//  RestAssured.given().log().all() .body(employee) .post();
		 
        ObjectMapper obj = new ObjectMapper();
		
		String new_Obj =  obj.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
	
		System.out.println(new_Obj);

	}

}
