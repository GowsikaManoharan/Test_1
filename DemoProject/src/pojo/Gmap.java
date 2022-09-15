package pojo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Gmap {
	private int accuracy;
	private String name;
	private String phone_number;
	private String address;
	private String website;
	private String language;
	private Location location;
	private ArrayList<String> types;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPlace_id() {
		return place_id;
	}

	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String status;
	private String place_id;
	private String scope;
	private String reference;
	private String id;

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public ArrayList<String> getTypes() {
		return types;
	}

	public void setTypes(ArrayList<String> types) {
		this.types = types;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gmap gm = new Gmap();
		gm.setAccuracy(40);
		gm.setAddress("29, side layout, cohen 09");
		gm.setLanguage("English");
		gm.setName("Gowsika");
		gm.setPhone_number("123456789");
		gm.setWebsite("websitelink");
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		gm.setLocation(l);
		ArrayList<String> as = new ArrayList<String>();
		as.add("shoe park");
		as.add("Shop");
		gm.setTypes(as);
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		Response as1 =given().queryParams("key", "qaclick123").header("Content-Type", "application/json")
				// .expect().defaultParser(Parser.JSON)
				.body(gm).when().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200).extract().response();
		Gmap gh =as1.as(Gmap.class);
		System.out.println(gh.getId());
	}

}
