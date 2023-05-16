package Eventtest;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Createevent.Eventpom;
import Utils.Utility;
import fmswallet.Walletlogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class eventtestng 
{
	Walletlogin wlgin;
	WebDriver driver;
	Eventpom eve;
	JavascriptExecutor js;
	WebDriverWait wait;
	JavascriptExecutor js1;
	/*@Parameters("browsers")
	
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
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		wlgin=new Walletlogin(driver);
		driver.get("http://stg-wallet.goldsikka.com/auth/login");
		driver.manage().window().maximize();
	}

	@BeforeMethod
	
	public void beforemethod() throws InterruptedException
	{
		wlgin=new Walletlogin(driver);
		eve=new Eventpom(driver);
	}

	@Test
	
	public void test1() throws InterruptedException
	{
		wlgin.mobileno();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		eve.event();
		Thread.sleep(2000);
		eve.eventtype();
		Thread.sleep(2000);
		eve.eventname();
		Thread.sleep(2000);
		eve.eventholder();
		//js.executeScript("window.scrollBy(0,350)", "");
		//eve.eventdate();
		//Thread.sleep(2000);
		//js.executeScript("window.scrollBy(0,350)", "");
		//eve.eventtime();
		eve.date();
		eve.venue();
		WebElement photos = driver.findElement(By.xpath("/html/body/app-root/main/app-app-layout/section/section/section/app-event-create/div/div/div/div/div/form/div/div[9]/input"));
		photos.sendKeys("C:\\photo\\istockphoto-1370630918-170667a.jpg");
	        Thread.sleep(2000);
	        js1=(JavascriptExecutor)driver;
			js1.executeScript("window.scrollBy(0,350)");
			Thread.sleep(2000);
	    eve.submit();
	    
	    Thread.sleep(5000);
	    driver.switchTo().alert().accept();
	}
	
	@AfterMethod
	
	public void aftermethod(ITestResult result) throws IOException
	{
		if (ITestResult.FAILURE==result.getStatus())
		{
			Utility.captureScreenshot(driver, 001);
		}
	}
	
	@AfterClass
	
	public void afterclass() throws InterruptedException
	{
		driver.close();
	}	
}
