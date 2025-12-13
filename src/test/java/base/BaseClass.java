package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.DriverFactory;

public class BaseClass 
{
	private static WebDriver driver;
	
	@BeforeTest
	public void openBrowser()
	{
		DriverFactory.openBrowser();
	}
	
	@AfterTest
	public void closeBrowser()
	{
		DriverFactory.closeBrowser();
	}

}
