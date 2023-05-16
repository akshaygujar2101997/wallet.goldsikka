package passbook;

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
import passbookpom.Passbookpom;

public class passbooktestng 
{
	Walletlogin wlgin;
	WebDriver driver;
	Passbookpom pass;
	JavascriptExecutor js;	
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
		pass=new Passbookpom(driver);
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
		pass.passbook();
		Thread.sleep(2000);
		pass.type();
	}
	
	
	@AfterMethod
	
	public void aftermethod(ITestResult result) throws IOException
	{
		if (ITestResult.FAILURE==result.getStatus())
		{
			Utility.captureScreenshot(driver, 001);
		}
		wlgin.logout();
		driver.switchTo().alert().accept();
	}
	
	
	@AfterClass
	
	public void afterclass()
	{
		driver.close();
	}
}
