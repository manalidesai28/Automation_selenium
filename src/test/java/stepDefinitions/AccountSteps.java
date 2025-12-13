package stepDefinitions;

import org.openqa.selenium.WebDriver;

import actions.AccountInfoActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.ConfigReader;
import utils.DriverFactory;

public class AccountSteps 
{
	private static WebDriver driver = DriverFactory.getDriver();
	
	AccountInfoActions aia = new AccountInfoActions(driver);
	
	@Given("user enters details on account information page for creating account")
	public void accountinfo()
	{
		aia.title();
		aia.password(ConfigReader.getData("password"));
		aia.days(ConfigReader.getData("days"));
		aia.months(ConfigReader.getData("months"));
		aia.years(ConfigReader.getData("years"));
		//aia.newsletter();
		//aia.optin();
		aia.first_name(ConfigReader.getData("firstname"));
		aia.last_name(ConfigReader.getData("lastname"));
		aia.company(ConfigReader.getData("company"));
		aia.address1(ConfigReader.getData("address1"));
		aia.address2(ConfigReader.getData("address2"));
		aia.country(ConfigReader.getData("country"));
		aia.state(ConfigReader.getData("state"));
		aia.city(ConfigReader.getData("city"));
		aia.zipcode(ConfigReader.getData("zipcode"));
		aia.mobilenumber(ConfigReader.getData("mobilenumber"));
		aia.createaccount();
	}
	
	@When("user clicks on Continue button on Account Created page")
	public void accountcreated()
	{
		aia.continuebutton();
	}
	
	@Then("user will clicks on Products menu to navigate to Products page")
	public void dashboard()
	{
		aia.products();
	}
}
