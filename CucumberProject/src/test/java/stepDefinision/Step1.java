package stepDefinision;
import org.apache.commons.lang.RandomStringUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step1 {
	 @Given("Set configuration {String}")
	    public void set_configuration(String us)  {
		 System.out.println(us);
	        
	    }

	    @When("open Chrome Browser")
	    public void open_chrome_browser() {
	    	System.out.println("open_chrome_browser");
	    }

	    @Then("^Launch Google$")
	    public void launch_google() {
	    	System.out.println("launch_google");
	    }

	    @And("^validate title$")
	    public void validate_title() {
	    	System.out.println("validate_title");
	    	RandomStringUtils.randomAlphanumeric(10);
	    }


	}

