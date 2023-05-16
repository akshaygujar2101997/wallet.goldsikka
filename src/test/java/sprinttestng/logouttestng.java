package sprinttestng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.Utility;
import fmswallet.Walletlogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class logouttestng 
{
	Walletlogin wlgin;
	WebDriver driver;
	WebDriverWait wait;
	
	
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
		//goldsvdh=new Goldsuvidha(driver);
	}
	
	@Test
	public void test2() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wlgin.mobileno();
		wlgin.logout();
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
	public void aftertest()
	{
		driver.close();
	}
}
