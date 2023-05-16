package fmswallet;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Walletlogin 
{
	
	JavascriptExecutor js;
	WebDriver driver;
	@FindBy (xpath="//input[@placeholder=\"Email / mobile number\"]")
	private WebElement mobileno;

	@FindBy (xpath="//button[@class=\"btn btn-primary btn-block btn-md\"]")
	private WebElement continew;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/app-user-sidebar/nav/div[2]/div[2]/ul/li[1]/a")
	private WebElement dashboard;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/header/div/ul/li[2]/button")
	private WebElement logout;
	
	public Walletlogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	


	public void mobileno() throws InterruptedException
	{
	/*	
	   js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
	*/
		mobileno.sendKeys("930941494");
		continew.click();
		mobileno.clear();
		Thread.sleep(3000);
		mobileno.sendKeys("fgjhjhj");
		continew.click();
		mobileno.clear();
		Thread.sleep(3000);
		mobileno.sendKeys("9100345025");
		continew.click();
	}
	
	
	public void logout()
	{
		dashboard.click();
		logout.click();
	}
}
