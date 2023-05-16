package dashboard;

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
import fmswallet.dashboard;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dashboardtestng 
{
	Walletlogin wlgin;
	WebDriver driver;
	dashboard dash;
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
		dash=new dashboard(driver);
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
		js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
		dash.output1();
		js.executeScript("window.scrollBy(0,350)", "");
		dash.output2();
		dash.output3();
		dash.output4();
		dash.output5();
		dash.output6();
		dash.output7();
		dash.download();
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
