package Files;

import pojo.project;
import tests.Basic_Rest1;

public class BodyGoogle {
	public static String place_Id = Basic_Rest1.placeId;

	public static String addPlace() {
		return "{\r\n" + "  \"location\": {\r\n" + "    \"lat\": -38.383494,\r\n" + "    \"lng\": 33.427362\r\n"
				+ "  },\r\n" + "  \"accuracy\": 50,\r\n" + "  \"name\": \"Frontline house\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n" + "  \"types\": [\r\n" + "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n" + "  ],\r\n" + "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n" + "}\r\n" + "";

	}

	public static String updatePlace(String place_Id1, String address) {
		return "{\r\n" + "\"place_id\":\"" + place_Id1 + "\",\r\n" + "\"address\":\"" + address + "\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n" + "}\r\n" + "";

	}

	public static String complexJason() {
		return "{\r\n" + "\r\n" + "\"dashboard\": {\r\n" + "\r\n" + "\"purchaseAmount\": 910,\r\n" + "\r\n"
				+ "\"website\": \"rahulshettyacademy.com\"\r\n" + "\r\n" + "},\r\n" + "\r\n" + "\"courses\": [\r\n"
				+ "\r\n" + "{\r\n" + "\r\n" + "\"title\": \"Selenium Python\",\r\n" + "\r\n" + "\"price\": 50,\r\n"
				+ "\r\n" + "\"copies\": 6\r\n" + "\r\n" + "},\r\n" + "\r\n" + "{\r\n" + "\r\n"
				+ "\"title\": \"Cypress\",\r\n" + "\r\n" + "\"price\": 40,\r\n" + "\r\n" + "\"copies\": 4\r\n" + "\r\n"
				+ "},\r\n" + "\r\n" + "{\r\n" + "\r\n" + "\"title\": \"RPA\",\r\n" + "\r\n" + "\"price\": 45,\r\n"
				+ "\r\n" + "\"copies\": 10\r\n" + "\r\n" + "}\r\n" + "\r\n" + "]\r\n" + "\r\n" + "}\r\n" + "\r\n" + "";
	}

	public static String Library(String id1, String id21) {
		return "{\r\n" + "\r\n" + "\"name\":\"Learn Appium Automation with Java\",\r\n" + "\"isbn\":\"" + id1
				+ "\",\r\n" + "\"aisle\":\"" + id21 + "\",\r\n" + "\"author\":\"John foe\"\r\n" + "}\r\n" + "";
	}

	public static String Serial_Deserial() {
		return "{\r\n" + "\"url\": \"rahulshettyacademy.com\",\r\n" + "\"services\": \"Project Support\",\r\n"
				+ "\"expertise\": \"Automation\",\r\n" + "\"courses\": {\r\n" + "\"webAutomation\": [\r\n" + "{\r\n"
				+ "\"CourseTitle\": \"Selenium\",\r\n" + "\"Price\": \"40\"\r\n" + "},\r\n" + "{\r\n"
				+ "\"CourseTitle\": \"Cypress\",\r\n" + "\"Price\": \"50\"\r\n" + "},\r\n" + "{\r\n"
				+ "\"CourseTitle\": \"Protractor\",\r\n" + "\"Price\": \"40\"\r\n" + "}\r\n" + "],\r\n"
				+ "\"API\": [\r\n" + "{\r\n" + "\"CourseTitle\": \"RestAssured\",\r\n" + "\"Price\": \"50\"\r\n"
				+ "},\r\n" + "{\r\n" + "\"CourseTitle\": \"Soap UI\",\r\n" + "\"Price\": \"40\"\r\n" + "}\r\n"
				+ "],\r\n" + "\"Mobile\": [\r\n" + "{\r\n" + "\"CourseTitle\": \"Appium\",\r\n"
				+ "\"Price\": \"60\"\r\n" + "}\r\n" + "]\r\n" + "},\r\n" + "\"instructor\": \"Rahul Shetty\",\r\n"
				+ "\"linkedIn\": \"Linkedinlink\"\r\n" + "}\r\n" + "";
	}

}
