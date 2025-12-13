package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountInfoActions 
{
	private static WebDriver driver = null;
	
	public AccountInfoActions(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='uniform-id_gender2']")
	private WebElement titlee;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordd;

	@FindBy(xpath = "//select[@id='days']")
	private WebElement dayss;

	@FindBy(xpath = "//select[@id='months']")
	private WebElement monthss;

	@FindBy(xpath = "//select[@id='years']")
	private WebElement yearss;

//	@FindBy(xpath = "//input[@id='newsletter']")
//	private WebElement newsletterr;
//
//	@FindBy(xpath = "//input[@id='optin']")
//	private WebElement optinn;

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement first_namee;

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement last_namee;

	@FindBy(xpath = "//input[@id='company']")
	private WebElement companyy;

	@FindBy(xpath = "//input[@id='address1']")
	private WebElement address11;

	@FindBy(xpath = "//input[@id='address2']")
	private WebElement address22;

	@FindBy(xpath = "//select[@id='country']")
	private WebElement countryy;

	@FindBy(xpath = "//input[@id='state']")
	private WebElement statee;

	@FindBy(xpath = "//input[@id='city']")
	private WebElement cityy;

	@FindBy(xpath = "//input[@id='zipcode']")
	private WebElement zipcodee;

	@FindBy(xpath = "//input[@id='mobile_number']")
	private WebElement mobilenumberr;

	@FindBy(xpath = "//button[@data-qa='create-account']")
	private WebElement createaccountt;

	@FindBy(xpath = "//a[@data-qa='continue-button']")
	private WebElement continuebuttonn;

	@FindBy(xpath = "//a[@href='/products']")
	private WebElement productss;
	
	public void title()
	{
		titlee.click();
	}

	public void password(String data)
	{
		passwordd.sendKeys(data);
	}

	public void days(String data)
	{
		//WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
		Select sel = new Select(dayss);
		sel.selectByVisibleText(data);
	}

	public void months(String data)
	{
		//WebElement months = driver.findElement(By.xpath("//select[@id='months']"));
		Select sel2 = new Select(monthss);
		sel2.selectByVisibleText(data);
	}

	public void years(String data)
	{
		//WebElement years = driver.findElement(By.xpath("//select[@id='years']"));
		Select sel3 = new Select(yearss);
		sel3.selectByVisibleText(data);
	}

//	public void newsletter()
//	{
//		newsletterr.click();
//	}
//
//	public void optin()
//	{
//		optinn.click();
//	}

	public void first_name(String data)
	{
		first_namee.sendKeys(data);
	}

	public void last_name(String data)
	{
		last_namee.sendKeys(data);
	}

	public void company(String data)
	{
		companyy.sendKeys(data);
	}

	public void address1(String data)
	{
		address11.sendKeys(data);
	}

	public void address2(String data)
	{
		address22.sendKeys(data);
	}

	public void country(String data)
	{
		//WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		Select sel4 = new Select(countryy);
		sel4.selectByVisibleText(data);
	}

	public void state(String data)
	{
		statee.sendKeys(data);
	}

	public void city(String data)
	{
		cityy.sendKeys(data);
	}

	public void zipcode(String data)
	{
		zipcodee.sendKeys(data);
	}

	public void mobilenumber(String data)
	{
		mobilenumberr.sendKeys(data);
	}

	public void createaccount()
	{
		createaccountt.click();
	}

	public void continuebutton()
	{
		continuebuttonn.click();
	}

	public void products()
	{
		productss.click();
	}
}
