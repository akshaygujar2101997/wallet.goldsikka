package fmswallet;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboard 
{
	WebDriver driver;
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-dashboard/section/div[2]/div[1]/div/div[2]/div/div/div/div/h5")
	private WebElement walletgold;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-dashboard/section/div[2]/div[1]/div/div[2]/div/div/div/div/small")
	private WebElement walletgoldmoney;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-dashboard/section/div[2]/div[2]/div/div[2]/div/h5[1]")
	private WebElement Buygoldprice;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-dashboard/section/div[2]/div[2]/div/div[2]/div/h5[2]")
	private WebElement sellgoldprice;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-dashboard/section/div[2]/div[3]/div/div[2]/div/div/h4[1]/b")
	private WebElement referalcode;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-dashboard/section/div[2]/div[3]/div/div[2]/div/div/h4[2]/b")
	private WebElement totalreferammount;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-dashboard/section/div[2]/div[4]/div/div[2]/div/div/div/div/h1")
	private WebElement totalwalletammount;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-dashboard/section/div[3]/div[2]/div/table/tbody/tr[1]/td[6]/a")
	private WebElement download;
	
	
	
	
	
	public dashboard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	public void output1() throws InterruptedException
	{ 
		Thread.sleep(2000);
		String gold = walletgold.getText();
		System.out.println(gold);
		
	}
	public void output2() throws InterruptedException
	{
		Thread.sleep(2000);
		String goldmoney = walletgoldmoney.getText();
		System.out.println(goldmoney);
	}	
	
	public void output3() throws InterruptedException
	{
		Thread.sleep(2000);
		String buyprice = Buygoldprice.getText();
		System.out.println(buyprice);
	}
	public void output4() throws InterruptedException 
	{
		Thread.sleep(2000);
		String sellprice = sellgoldprice.getText();
		System.out.println(sellprice);
	}
	public void output5() throws InterruptedException
	{
		Thread.sleep(2000);
		String refercode = referalcode.getText();
		System.out.println(refercode);
	}
	public void output6() throws InterruptedException
	{
		Thread.sleep(2000);
		String totatreferammount = totalreferammount.getText();
		System.out.println(totatreferammount);
	}
	public void output7() throws InterruptedException
	{
		Thread.sleep(2000);
		String wallettotal = totalwalletammount.getText();
		System.out.println(wallettotal);
	}

	public void download() throws InterruptedException
	{
		Thread.sleep(2000);
		download.click();
	}
}
