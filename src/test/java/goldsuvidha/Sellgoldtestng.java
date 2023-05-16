package goldsuvidha;

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
import goldsuvidha1.Sellgold;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sellgoldtestng 
{

	Walletlogin wlgin;
	WebDriver driver;
	Sellgold sgold;
	JavascriptExecutor js;
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
		sgold=new Sellgold(driver);
	}
	
	@Test
	
	public void test2() throws InterruptedException
	{
		wlgin.mobileno();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		sgold.gold();
		Thread.sleep(2000);
		sgold.bank();
		//Thread.sleep(2000);
		//sgold.accno();
		Thread.sleep(2000);
		sgold.continu();
		Thread.sleep(5000);
		sgold.feedback();
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
