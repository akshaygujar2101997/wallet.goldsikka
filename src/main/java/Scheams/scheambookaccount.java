package Scheams;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class scheambookaccount 
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
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-transaction-successful/section/div[2]/div/div/div/form/div/div[1]/div/textarea")
	private WebElement feedback;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-transaction-successful/section/div[2]/div/div/div/form/div/div[2]/div/ul/label[2]")
	private WebElement star;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-transaction-successful/section/div[2]/div/div/div/form/div/div[3]/button")
	private WebElement submit;

	
	public scheambookaccount(WebDriver driver)
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
		bamount.sendKeys("1300");
	}
	
	public void agree() throws InterruptedException
	{
		Thread.sleep(2000);
		agree.click();
	}
	public void start()
	{
		start.click();
	}
	public void feedback()
	{
		feedback.sendKeys("good");
		star.click();
		submit.click();
	}	
}
