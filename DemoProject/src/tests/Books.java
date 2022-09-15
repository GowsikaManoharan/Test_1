package tests;

import java.util.List;

import pojo.Courses;

public class Books {
	private List<Courses> books;
	private String accessToken;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public List<Courses> getBooks() {
		return books;
	}

	public void setBooks(List<Courses> books) {
		this.books = books;
	}

}
