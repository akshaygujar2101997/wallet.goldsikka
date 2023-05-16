package Scheams;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class scheam 
{
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/app-user-sidebar/nav/div[2]/div[2]/ul/li[2]/a")
	private WebElement gscheam;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-schemes-list/section/div/div[2]/div/div/div/div/a")
	private WebElement subscribe;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-scheme-subscribe/section/section[2]/div/app-jewellery-form-component/section/div[2]/form/div[1]/div/select")
	private WebElement ammount;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-scheme-subscribe/section/section[2]/div/app-jewellery-form-component/section/div[2]/form/div[3]/div[1]/input")
	private WebElement bookingacc;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-scheme-subscribe/section/section[2]/div/app-jewellery-form-component/section/div[2]/form/div[3]/div[3]/div[1]/input")
	private WebElement bamount;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-scheme-subscribe/section/section[2]/div/app-jewellery-form-component/section/div[2]/form/div[4]/div/input")
	private WebElement agree;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-scheme-subscribe/section/section[2]/div/app-jewellery-form-component/section/div[2]/form/div[6]/button")
	private WebElement start;
	
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[2]/div[1]/div[1]/div[1]/div/div/div[2]/div/button[3]/div")
	private WebElement netbanking;
	
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[2]/div[5]/div[1]/div/div/div[1]/div[2]/label")
	private WebElement icici;
	
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[4]/div[2]/button")
	private WebElement paynow;
	
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[2]/div[1]/div[1]/div/div/div[2]/div/div/div[2]/input")
	private WebElement number;
	
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[4]/div/button")
	private WebElement continu;
	
	
	
	
	public scheam(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void  gscheam()
	{
		 gscheam.click();
		 subscribe.click();
	}
	public void ammount() throws InterruptedException
	{
		Thread.sleep(6000);
		Select s=new Select(ammount);
		s.selectByIndex(1);
	}
	public void bookingacc() throws InterruptedException
	{
		bookingacc.click();
		Thread.sleep(2000);
		bamount.sendKeys("300");
	}
	
	
	public void agree() throws InterruptedException
	{
		Thread.sleep(2000);
		agree.click();
	}
	public void start() throws InterruptedException
	{
		Thread.sleep(2000);
		start.click();
	}
	public void number() throws InterruptedException
	{
		Thread.sleep(5000);
		boolean enabl = number.isEnabled();
		System.out.println(enabl);
		number.sendKeys("7666575245");
		continu.click();
	}
	public void netbanking() throws InterruptedException
	{
		Thread.sleep(5000);
		netbanking.click();
		icici.click();
	}
	public void paynow()
	{
		paynow.click();
	}
}
