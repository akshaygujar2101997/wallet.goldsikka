package goldsuvidha1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class transfer 
{
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/app-user-sidebar/nav/div[2]/div[2]/ul/li[3]/a")
	private WebElement suvidha;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/app-user-sidebar/nav/div[2]/div[2]/ul/li[3]/div/ul/li[3]/a")
	private WebElement transfer;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-transfer-gold/section/section/form/div[1]/div[1]/input")
	private WebElement number;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-transfer-gold/section/section/form/div[2]/div/input")
	private WebElement gram;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-transfer-gold/section/section/form/div[4]/button")
	private WebElement continu;
	
	
	
	public transfer (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void suvidha() throws InterruptedException
	{
		suvidha.click();
		Thread.sleep(2000);
		transfer.click();
		Thread.sleep(2000);
		number.sendKeys("7032753299");
		gram.sendKeys("3");
		continu.click();
	}
}
