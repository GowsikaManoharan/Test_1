package pojo;

import java.util.List;

import Files.BodyGoogle;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.filter.session.SessionFilter;
import io.restassured.parsing.Parser;
import io.restassured.response.ResponseBodyExtractionOptions;
import tests.Books;

public class project {
	private List<Courses> books;

	public List<Courses> getBooks() {
		return books;
	}

	public void setBooks(List<Courses> books) {
		this.books = books;
	}

	public static void main(String[] args) {
		/*
		 * SessionFilter sf = new SessionFilter(); RestAssured.baseURI =
		 * "https://simple-books-api.glitch.me";
		 * given().log().all().header("Content-Type", "application/json") .body("{\r\n"
		 * + "    \"clientName\": \"Postman\",\r\n" +
		 * "    \"clientEmail\": \"Gowsika13@example.com\"\r\n" + "}")
		 * .filter(sf).when().post("/api-clients").then().log().all().assertThat().
		 * statusCode(201);
		 * 
		 * given().log().all().header("Content-Type", "application/json").header(
		 * "Authorization","Bearer b3c21c36cda98f1095183870be5503eaead938f389bc256b3e13ab8e997589ea"
		 * ).body("{\r\n" + "  \"bookId\": 1,\r\n" + "  \"customerName\": \"John\"\r\n"
		 * +
		 * "}").when().post("/orders").then().log().all().assertThat().statusCode(201);
		 * 
		 * 		Books pc =given().log().all()
				.header("Authorization", "Bearer b3c21c36cda98f1095183870be5503eaead938f389bc256b3e13ab8e997589ea")
				.expect().defaultParser(Parser.JSON).when().get("/books").as(Books.class);
		 */
		RestAssured.baseURI = "https://simple-books-api.glitch.me";

		Books pc =given().header("Content-Type", "application/json").expect().defaultParser(Parser.JSON).body("{\r\n" + " \"clientName\": \"Postman\",\r\n" +
				  "    \"clientEmail\": \"Gowsika153@example.com\"\r\n" + "}").
				 when().post("/api-clients").as(Books.class);
		System.out.println(pc.getAccessToken());
	}
}
