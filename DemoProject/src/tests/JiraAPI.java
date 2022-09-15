package tests;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.*;

import java.io.File;

import static io.restassured.RestAssured.*;

public class JiraAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Cookie Authentication
		SessionFilter sf = new SessionFilter();
		RestAssured.baseURI = "http://localhost:8080";
		String cookieResponse = given().log().all().contentType("application/json")
				.body("{ \"username\": \"gowsikamanoharan\", \"password\": \"Gowsi@123\" }").filter(sf).when()
				.post("/rest/auth/1/session").then().log().all().body("session.name", equalTo("JSESSIONID")).extract()
				.response().asString();
		System.out.println(cookieResponse);
		JsonPath j = new JsonPath(cookieResponse);
		System.out.println(j.getString("session.value"));
		// Add a comment
		String postcmd = given().log().all().pathParam("id", "10002").contentType("application/json")
				.body("{\r\n" + "    \"body\": \"Test Command\",\r\n" + "    \"visibility\": {\r\n"
						+ "        \"type\": \"role\",\r\n" + "        \"value\": \"Administrators\"\r\n" + "    }\r\n"
						+ "}")
				.filter(sf).when().post("/rest/api/2/issue/{id}/comment").then().log().all().extract().response()
				.asString();
		// Sending a filter,
		given().relaxedHTTPSValidation().log().all().pathParam("id", "10002").header("X-Atlassian-Token", "no-check")
				.header("Content-Type", "multipart/form-data")
				.multiPart("file",
						new File("C:\\Personal Project\\Projects\\RestAssured\\DemoProject\\src\\Files\\jira.txt"))
				.filter(sf).when().post("/rest/api/2/issue/{id}/attachments").then().log().all().assertThat()
				.statusCode(200).extract().response().asString();
	}

}
