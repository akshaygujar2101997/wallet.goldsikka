package sprinttestng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Scheams.scheambookaccount;
import Utils.Utility;
import fmswallet.Walletlogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class scheambookaccounttestng 
{
	Walletlogin wlgin;
	WebDriver driver;
	scheambookaccount sc;
	JavascriptExecutor js;
	WebDriverWait wait;

	@BeforeClass
	public void beforeclass() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wlgin=new Walletlogin(driver);
		sc=new scheambookaccount(driver);
		driver.get("http://stg-wallet.goldsikka.com/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wlgin.mobileno();
	}
	@BeforeMethod
	public void beforemethod() throws InterruptedException
	{
		//wlgin.mobileno();
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		sc.gscheam();
		Thread.sleep(2000);
		sc.ammount();
		Thread.sleep(2000);
		js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		sc.bookingacc();
		js.executeScript("window.scrollBy(0,350)", "");
		sc.agree();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,350)", "");
		sc.start();
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		sc.feedback();
		
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
	public void afterclass()
	{
		driver.close();
	}
	
	
}
