package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import actions.LoginPageActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.ConfigReader;
import utils.DriverFactory;

public class LoginSteps 
{
	private static WebDriver driver = DriverFactory.openBrowser();
	Logger logger = LogManager.getLogger(LoginSteps.class);
	
	LoginPageActions lpa = new LoginPageActions(driver);
	
	@Given("user is on login or signup page")
	public void name()
	{
		driver.get(ConfigReader.getData("baseUrl"));
		logger.info("application link has been opened");
		//String title = driver.getTitle();
		//System.out.println("Title of this page is : " +title);
		//Assert.assertEquals(title,"Automation Exercise - Signup / Login","Assert failed");
	}
	
	@When("user enters name and email address")
	public void email()
	{
		lpa.name(ConfigReader.getData("name"));
		lpa.email(ConfigReader.getData("emailaddress"));
		logger.info("user has entered name and email address");
		
	}
	
	@Then("user can clicks on signup button")
	public void signupbutton()
	{
		lpa.signupbutton();
		logger.info("user has clicked on signup button");
	}

}
