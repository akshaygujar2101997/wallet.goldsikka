package Bookingacc;

import java.io.IOException;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class addmoneytestng 
{
	WebDriver driver;
	Walletlogin wlgin;
	addmoney money;
	
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
		money=new addmoney(driver);
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
		Thread.sleep(2000);
		money.booking();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		money.number();
		money.netbanking();
		String parentHandle=driver.getWindowHandle();
		System.out.println("parent window -"  + parentHandle);
        Set<String> handles =driver.getWindowHandles();
        for(String handle:handles) 
        {
        	System.out.println(handle);
        	if(!handle.equals(parentHandle)) 
        	{
        		driver.switchTo().window(handle);
        		driver.findElement(By.xpath("//button[text()='Success']")).click();
        	}
        }
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
	//	wlgin.logout();
	//	driver.switchTo().alert().accept();
	driver.close();
	}
}
