package ecommerce;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.Utility;
import fmswallet.Walletlogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ecommercetestng 
{
	Walletlogin wlgin;
	WebDriver driver;
	Ecommerce1 ecom;
	JavascriptExecutor js;
	JavascriptExecutor js1;
	
/*
	@Parameters("browsers")
	
	@BeforeTest
	
	public void beforetest(String browsername)
	{
		if (browsername.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		if (browsername.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}

*/
	@BeforeClass
	
	public void beforeclass()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wlgin=new Walletlogin(driver);
		ecom=new Ecommerce1(driver);
		driver.get("http://stg-wallet.goldsikka.com/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	
	
	@BeforeMethod
	
	public void beforemethod() throws InterruptedException
	{
		wlgin.mobileno();
	}
	
	@Test
	
	public void test() throws InterruptedException
	{
		Thread.sleep(5000);
		ecom.ecom();
		Thread.sleep(2000);
		ecom.filter();
		Thread.sleep(2000);
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		ecom.checkout();
		Thread.sleep(2000);
		ecom.bookinacc();
		Thread.sleep(2000);
		js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		ecom.proceedtopay();
	}
	@AfterMethod
	
	public void aftermethod(ITestResult result) throws IOException
	{
		if (ITestResult.FAILURE==result.getStatus())
		{
			Utility.captureScreenshot(driver, 001);
		}
		//wlgin.logout();
		//driver.switchTo().alert().accept();
	}
	
	
	@AfterClass
	
	public void afterclass()

	{
		//driver.close();
	}
}
