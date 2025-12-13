
package listner;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.util.Date;

import utils.DriverFactory;

import utils.DriverFactory;

public class Listner implements ITestListener
{
	private static WebDriver driver = DriverFactory.openBrowser();

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
		//System.out.println("Test case pass");
		try
		{
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(screenshotFile,new File(".//screenshot/screen.png"));
			Date currentDate = new Date();
			System.out.println("Current date is : " + currentDate);
			String test = currentDate.toString().replace(" ","-").replace(":","-");
			FileUtils.copyFile(screenshotFile,new File(".//screenshot//" + test + ".png"));
			//Reporter.log("Test case passed");
			Reporter.log(result.getName());
						
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onFinish(context);
	}
	

}
