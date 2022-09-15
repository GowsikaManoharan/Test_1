package tests;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RequestSpecification r = new RequestSpecBuilder().setBaseUri("http://localhost:8080")
				.addPathParam("id", "10002").addHeader("content-Type", "application/json").build();
		ResponseSpecification re = new ResponseSpecBuilder().setDefaultParser(Parser.JSON).expectStatusCode(200)
				.expectContentType("application/json").build();
		String postcmd = given().spec(r).body("String")
				.when().post("/rest/api/2/issue/{id}/comment").then().spec(re).extract().response().asString();

	}

}
