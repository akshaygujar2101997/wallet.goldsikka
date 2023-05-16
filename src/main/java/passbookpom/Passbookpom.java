package passbookpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Passbookpom 
{
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/app-user-sidebar/nav/div[2]/div[2]/ul/li[5]/a")
	private WebElement passbook;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-passbook/section/div[1]/div[2]/form/div/select")
	private WebElement type;
	
	
	
	public Passbookpom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void passbook()
	{
		passbook.click();
	}
	
	public void type() throws InterruptedException
	{
		Select s=new Select(type);
		s.selectByIndex(1);
		Thread.sleep(2000);
		
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		s.selectByIndex(3);
		Thread.sleep(2000);
		
		s.selectByIndex(4);
		Thread.sleep(2000);
		
		s.selectByIndex(5);
		Thread.sleep(2000);
		
		s.selectByIndex(6);
		Thread.sleep(2000);
		
		s.selectByIndex(7);
		Thread.sleep(2000);
	}
}
