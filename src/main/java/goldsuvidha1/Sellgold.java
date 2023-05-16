package goldsuvidha1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Sellgold 
{
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/app-user-sidebar/nav/div[2]/div[2]/ul/li[3]/a")
	private WebElement gold;

	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/app-user-sidebar/nav/div[2]/div[2]/ul/li[3]/div/ul/li[2]/a")
	private WebElement sellgold;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-sell-gold/section/section/form/div[1]/div[1]/input")
	private WebElement gram;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-sell-gold/section/section/form/div[3]/div/select")
	private WebElement bank;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-sell-gold/section/section/form/div[4]/div/select")
	private WebElement accno;
	
  //@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-sell-gold/section/section/form/div[5]/button")
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-sell-gold/section/section/form/div[4]/button")
	private WebElement continu;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-sell-gold/div[1]/div/div/div/form/div[1]/div[1]/textarea")
	private WebElement feedback;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-sell-gold/div[1]/div/div/div/form/div[2]/div/ul/label[2]")
	private WebElement star;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-sell-gold/div[1]/div/div/div/form/div[3]/button")
	private WebElement submitfeedback;
	
	
	public Sellgold(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	public void gold() throws InterruptedException
	{
		gold.click();
		Thread.sleep(2000);
		sellgold.click();
		Thread.sleep(2000);
		gram.sendKeys("1");
		Thread.sleep(3000);
		gram.clear();
		gram.sendKeys("32");
		Thread.sleep(2000);
		gram.clear();
		gram.sendKeys("3");
	}
	public void bank()
	{
		Select s=new Select(bank);
		//s.selectByIndex(1);
		s.selectByIndex(2);
	}
	public void accno() throws InterruptedException
	{
		Thread.sleep(3000);
		Select s=new Select(accno);
		s.selectByIndex(1);
	}
	
	public void continu()
	{
		continu.click();
	}	

	public void feedback() throws InterruptedException
	{
		Thread.sleep(8000);
		feedback.sendKeys("good");
		star.click();
		submitfeedback.click();
	}
}
