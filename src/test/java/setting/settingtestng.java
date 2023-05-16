package setting;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
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

public class settingtestng 
{
	Walletlogin wlgin;
	WebDriver driver;
	accounts acc;
	JavascriptExecutor js;
	JavascriptExecutor js1;
	JavascriptExecutor js2;
	JavascriptExecutor js3;


	WebDriverWait wait;
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
		acc=new accounts(driver);
	}
	
	@Test
	
	public void test1() throws InterruptedException
	{
		wlgin.mobileno();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		acc.setting();
		Thread.sleep(7000);
		acc.kyc();
		Thread.sleep(7000);
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
		acc.submitkyc();
		acc.nominee();
		Thread.sleep(2000);
		js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,350)", ""); 
		Thread.sleep(2000);
		acc.nomineesubmit();
		
		Thread.sleep(7000);
		acc.address();
		Thread.sleep(7000);
		acc.bank();
		Thread.sleep(2000);
		js2=(JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,350)");
		acc.submitbankdetails();
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
