package Bookingacc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class withdrawmoney 
{
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/app-user-sidebar/nav/div[2]/div[2]/ul/li[4]/a")
	private WebElement booking;

	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-money-wallet/div[1]/div/div/div/div[1]/div/div/div/a")
    private WebElement withdraw;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-money-wallet-transfer/section/section/form/div[2]/div[1]/input")
	private WebElement ammount;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-money-wallet-transfer/section/section/form/div[3]/div/select")
	private WebElement selectbank;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-money-wallet-transfer/section/section/form/div[4]/button")
	private WebElement continu;
	
	
	
	
	public withdrawmoney(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void booking() throws InterruptedException
	{
		booking.click();
		Thread.sleep(2000);
		withdraw.click();
		Thread.sleep(5000);
		ammount.sendKeys("3000");
	}
	public void selectbank() throws InterruptedException
	{
		Select s=new Select(selectbank);
		s.selectByIndex(1);
		Thread.sleep(2000);
		continu.click();
	}
}
