package apiTestCases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestPost {

	@Test
	public void testcase2() {

		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/create";
		RequestSpecification request = RestAssured.given();

		Object str = "{\"name\":\"Amey Tambe\",\"salary\":\"4300000\",\"age\":\"29\"}";
		
		request.header("Content-Type","application/json");
		
		Response response = request.request(Method.POST);
		
		System.out.println(response.getStatusCode());
		
		System.out.println(response.asString());
		
		
		

	}

}
