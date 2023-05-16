package Bookingacc;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addmoney 
{

	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/app-user-sidebar/nav/div[2]/div[2]/ul/li[4]/a")
	private WebElement booking;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-money-wallet/div[1]/div/div/div/div[2]/div/div/div/div/div/div/div/form/div/div[1]/div[1]/input")
	private WebElement money;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-money-wallet/div[1]/div/div/div/div[2]/div/div/div/div/div/div/div/form/div/div[2]/button[1]")
	private WebElement submit;
	
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[2]/div[1]/div[1]/div/div/div[2]/div/div/div[2]/input")
	private WebElement number;
	
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[4]/div/button")
	private WebElement continu;
	
	
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[2]/div[1]/div[1]/div[1]/div/div/div[2]/div/button[3]/div")
	private WebElement netbanking;
	
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[2]/div[5]/div[1]/div/div/div[1]/div[2]/label")
	private WebElement icici;
	
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[4]/div[2]/button")
	private WebElement paynow;
	
	
	
	
	
	
	public addmoney(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void booking() throws InterruptedException
	{
		booking.click();
		Thread.sleep(2000);
		money.sendKeys("10");
		submit.click();
		Thread.sleep(2000);
		money.clear();
		money.sendKeys("999999999");
		Thread.sleep(2000);
		submit.click();
		money.clear();
		Thread.sleep(2000);
		money.sendKeys("10000");
		submit.click();
	}
	public void number()
	{
		number.sendKeys("9000345025");
		continu.click();
	}
	public void netbanking() throws InterruptedException
	{
		Thread.sleep(2000);
		netbanking.click();
		Thread.sleep(2000);
		icici.click();
		Thread.sleep(2000);
		paynow.click();
	}
	
	
	
	
	
	
}
