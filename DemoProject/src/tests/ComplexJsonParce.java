package tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import Files.BodyGoogle;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParce {
	static int total = 0;
	static int totaldummy;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JsonPath js = new JsonPath(BodyGoogle.complexJason());
		/*
		 getting Json body from .json file 
		 JsonPath js = new JsonPath(new
		 String(Files.readAllBytes(Paths.get("C:\\Users\\gowsi\\OneDrive\\Documents\\RestAssuredAPI\\body.json"))));
		 */
		// Print No of courses returned by API
		int courseCount = js.getInt("courses.size()");
		System.out.println(courseCount);
		// Print Purchase Amount
		int purchaseAmt = js.get("dashboard.purchaseAmount");
		System.out.println("The purchase amt is " + purchaseAmt);
		// Print Title of the first course
		String firstCourse = js.getString("courses[1].title");
		System.out.println("The Title of the first Course is " + firstCourse);
		// Print All course titles and their respective Prices
		for (int i = 0; i < courseCount; i++) {
			System.out.println("Title is " + js.getString("courses[" + i + "].title") + " and price is "
					+ js.getInt("courses[" + i + "].price"));
		}
		// Print no of copies sold by RPA Course
		for (int i = 0; i < courseCount; i++) {

			String title = js.getString("courses[" + i + "].title");
			System.out.println(title);
			if (title.equals("RPA")) {
				System.out.println("No of copies sold by RPA Course " + js.getString("courses[" + i + "].copies"));
			}
		}
		// Verify if Sum of all Course prices matches with Purchase Amount
		for (int i = 0; i < courseCount; i++) {
			int price = js.get("courses[" + i + "].price");
			int copy = js.get("courses[" + i + "].copies");

			totaldummy = price * copy;
			total = total + totaldummy;

			if (purchaseAmt == total) {
				System.out.println("Sum of all Course prices matches with Purchase Amount");
			}
		}

	}

}
