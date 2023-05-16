package sprinttestng;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Scheams.scheam;
import Utils.Utility;
import fmswallet.Walletlogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Scheamtestng 
{
	Walletlogin wlgin;
	WebDriver driver;
	scheam sc;
	
	@BeforeClass
	public void beforeclass() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wlgin=new Walletlogin(driver);
		sc=new scheam(driver);
		driver.get("http://stg-wallet.goldsikka.com/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wlgin.mobileno();
	}
	
	@BeforeMethod
	public void beforemethod() throws InterruptedException
	{
	}
	
	@Test
	public void test() throws InterruptedException
	{
		sc.gscheam();
		sc.ammount();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
		sc.bookingacc();
		js.executeScript("window.scrollBy(0,350)", "");
		sc.agree();
		js.executeScript("window.scrollBy(0,350)", "");
		sc.start();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,350)", "");
		driver.switchTo().frame(1);
		sc.number();
		
		sc.netbanking();
		js.executeScript("window.scrollBy(0,350)", "");
		sc.paynow();
		//sc.success(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,350)", "");
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
		driver.close();
	}
	

}
