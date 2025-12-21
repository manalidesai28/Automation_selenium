package base;

import java.time.Duration;

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
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait
	}
	
	@AfterTest
	public void closeBrowser()
	{
		DriverFactory.closeBrowser();
	}

}
