package com.hellofresh.challenge;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import reports.JUnitHTMLReporter;

import org.json.simple.JSONObject;




public class WebApiTest extends JUnitHTMLReporter{
	
	@Test
	public void GetUSCountryDetails() throws Exception
	{   
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI ="http://services.groupkt.com/country/get/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "iso2code/US");
		JsonPath jsonPathEvaluator = response.jsonPath();
		String name = jsonPathEvaluator.get("RestResponse.result.name");
		String alpha2_code = jsonPathEvaluator.get("RestResponse.result.alpha2_code");
		String alpha3_code = jsonPathEvaluator.get("RestResponse.result.alpha3_code");
		List<String> Message = jsonPathEvaluator.get("RestResponse.messages");
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode,200);
		Assert.assertEquals(name, "United States of America");
		Assert.assertEquals(alpha2_code, "US");
		Assert.assertEquals(alpha3_code, "USA");
		Assert.assertTrue(Message.contains("Country found matching code [US]."));
 
	}
	
	@Test
	public void GetDECountryDetails() throws Exception
	{   
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI ="http://services.groupkt.com/country/get/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "iso2code/DE");
		JsonPath jsonPathEvaluator = response.jsonPath();
		String name = jsonPathEvaluator.get("RestResponse.result.name");
		String alpha2_code = jsonPathEvaluator.get("RestResponse.result.alpha2_code");
		String alpha3_code = jsonPathEvaluator.get("RestResponse.result.alpha3_code");
		List<String> Message = jsonPathEvaluator.get("RestResponse.messages");
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode,200);
		Assert.assertEquals(name, "Germany");
		Assert.assertEquals(alpha2_code, "DE");
		Assert.assertEquals(alpha3_code, "DEU");
		Assert.assertTrue(Message.contains("Country found matching code [DE]."));
 
	}
	
	@Test
	public void GetGBCountryDetails() throws Exception
	{   
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI ="http://services.groupkt.com/country/get/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "iso2code/GB");
		JsonPath jsonPathEvaluator = response.jsonPath();
		String name = jsonPathEvaluator.get("RestResponse.result.name");
		String alpha2_code = jsonPathEvaluator.get("RestResponse.result.alpha2_code");
		String alpha3_code = jsonPathEvaluator.get("RestResponse.result.alpha3_code");
		List<String> Message = jsonPathEvaluator.get("RestResponse.messages");
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode,200);
		Assert.assertEquals(name, "United Kingdom of Great Britain and Northern Ireland");
		Assert.assertEquals(alpha2_code, "GB");
		Assert.assertEquals(alpha3_code, "GBR");
		Assert.assertTrue(Message.contains("Country found matching code [GB]."));
	}
	
	@Test
	public void GetAllCountryDetailsValidate() throws Exception
	{   
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI ="http://services.groupkt.com/country/get/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "all");
		JsonPath jsonPathEvaluator = response.jsonPath();
			
		List<String> alpha2_code = jsonPathEvaluator.get("RestResponse.result.alpha2_code");
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode,200);
		Assert.assertTrue((alpha2_code.contains("US")));
		Assert.assertTrue((alpha2_code.contains("GB")));
		Assert.assertTrue((alpha2_code.contains("DE")));
	
 
	}
	
	@Test
	public void GetInvalidCountry() throws Exception
	{   
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI ="http://services.groupkt.com/country/get/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "iso2code/DEE");
		JsonPath jsonPathEvaluator = response.jsonPath();
			
		List<String> Message = jsonPathEvaluator.get("RestResponse.messages");
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode,200);
		Assert.assertTrue(Message.contains("No matching country found for requested code [DEE]."));
		
	
 
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void PostCountry()
	{		
		RestAssured.baseURI ="http://services.groupkt.com/country/";
		RequestSpecification request = RestAssured.given();
	 
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "Test Country"); // Cast
		requestParams.put("alpha2_code", "TC");
		requestParams.put("alpha3_code", "TCY");
	
		request.body(requestParams.toJSONString());
		Response response = request.post("/Post");
	 
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
	}
	
}
