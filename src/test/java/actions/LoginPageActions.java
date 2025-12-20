package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageActions 
{
	private static WebDriver driver = null;
	
	public LoginPageActions(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	driver.manage().timouts().implicitylyWait(Duration.ofSeconds(5)); //implicit wait
	
	@FindBy(xpath= "//input[@data-qa='signup-name']")
	WebElement namee;
	
	@FindBy(xpath= "//input[@data-qa='signup-email']")
	WebElement emaill;
	
	@FindBy(xpath= "//button[@data-qa='signup-button']")
	WebElement signupbuttonn;
	
	public void name(String name)
	{
		namee.sendKeys(name);
	}
	
	public void email(String email)
	{
		emaill.sendKeys(email);
	}
	
	public void signupbutton()
	{
		signupbuttonn.click();
	}

}
