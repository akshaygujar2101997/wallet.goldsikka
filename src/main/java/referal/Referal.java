package referal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Referal 
{
	WebDriver driver;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/app-user-sidebar/nav/div[2]/div[2]/ul/li[8]/a")
	private WebElement refer;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-referral-earn/section/div[1]/div/div[1]/div/div[2]/h2")
	private WebElement refercode;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-referral-earn/section/div[1]/div/div[2]/div/div[2]")
	private WebElement totalrefer;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-referral-earn/section/div[1]/div/div[3]/div/div[2]/h2")
	private WebElement totalreferammount;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-referral-earn/section/div[1]/div/div[4]/div/div[2]")
	private WebElement bookingaccbalance;
	
	
	
	
	public Referal(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void referal() throws InterruptedException
	{
		Thread.sleep(2000);
		refer.click();
		Thread.sleep(2000);
		String code = refercode.getText();
		System.out.println("refercode is "+code);
		Thread.sleep(2000);
		String trefer = totalrefer.getText();
		System.out.println("total number of refer "+trefer);
		String ammount = totalreferammount.getText();
		System.out.println("total refer ammount is "+ammount);
		String balance = bookingaccbalance.getText();
		System.out.println("total booking account balance is "+balance);
		
	}
}
