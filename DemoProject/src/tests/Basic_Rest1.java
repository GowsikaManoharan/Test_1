package tests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import Files.BodyGoogle;

public class Basic_Rest1 {
	public static String placeId;
	public static String addressInitailUpdate = "Summer Walk, Africa";


	public static void main(String[] args) {

//Adding new place and storing place ID
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(BodyGoogle.addPlace()).when().post("/maps/api/place/add/json").then().log().all().assertThat()
				.statusCode(200).header("Content-Type", "application/json;charset=UTF-8").body("scope", equalTo("APP"))
				.extract().response().asString();
		// given().log().all().get("https://simple-books-api.glitch.me/status").then().log().all().statusCode(200);
		JsonPath js = new JsonPath(response);
		placeId = js.getString("place_id");
		System.out.println(placeId);

//Updating the existing ID
		given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(BodyGoogle.updatePlace(placeId,addressInitailUpdate )).when().put("/maps/api/place/update/json").then().log().all()
				.statusCode(200).body("msg", equalTo("Address successfully updated"));
//Getting the updated Address,
		String getAddress = given().queryParam("key", "qaclick123").queryParam("place_id", placeId).when().get("/maps/api/place/get/json")
		.then().extract().response().asString();
		JsonPath js1 = new JsonPath(getAddress);
		String addressUpdated = js1.getString("address");
		System.out.println(addressUpdated);
		Assert.assertEquals(addressInitailUpdate, addressUpdated);
		
		//getting body from file with .json extension
		//given().body(new String(Files.readAllBytes(Paths.get("C:\\Users\\gowsi\\OneDrive\\Documents\\RestAssuredAPI\\body.json"))))
	}
	
	

}
