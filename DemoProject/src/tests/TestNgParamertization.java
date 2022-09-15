package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Files.BodyGoogle;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestNgParamertization {
	public static int id;

	@Test(dataProvider="data")
	public void parameterMethod(String id1, String id21) {
		RestAssured.baseURI = "http://216.10.245.166";
		String string =given().header("Content-Type", "application/json").body(BodyGoogle.Library(id1,id21)).when().post("Library/Addbook.php").then()
				.assertThat().body("Msg", equalTo("successfully added")).extract().response().asString();
		JsonPath js = new JsonPath(string);
		id = js.get("ID");
	}
	@DataProvider(name ="data")
	public Object[][] data()
	{
		Object[][] data = new Object[][] {{"id1","123"},{"id5","1283"},{"id57","1293"}};
		return data;
		
		
	}
	
}
