package goldsuvidha1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class redeemgold 
{
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/app-user-sidebar/nav/div[2]/div[2]/ul/li[3]/a")
	private WebElement goldsuvidha;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/app-user-sidebar/nav/div[2]/div[2]/ul/li[3]/div/ul/li[4]/a")
	private WebElement redeem;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-with-draw/section/section/form/div[1]/div[1]/input")
	private WebElement grams;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-with-draw/section/section/form/div[4]/input")
	private WebElement bookingclick;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-with-draw/section/section/form/div[6]/div[1]/input")
	private WebElement ammount;//13800
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-with-draw/section/section/form/div[7]/button")
	private WebElement continu;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-with-draw/section/section/div/div[2]/div/div/div/form/div[1]/div[1]/textarea")
	private WebElement feedback;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-with-draw/section/section/div/div[2]/div/div/div/form/div[2]/div/ul/label[2]")
	private WebElement star;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-with-draw/section/section/div/div[2]/div/div/div/form/div[3]/button")
	private WebElement submit;
	
	
	
	public redeemgold(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	
	
	
	public void redeem() throws InterruptedException
	{
		Thread.sleep(2000);
		goldsuvidha.click();
		Thread.sleep(2000);
		redeem.click();
		Thread.sleep(2000);
		grams.sendKeys("1.5");
		Thread.sleep(2000);
		grams.clear();
		grams.sendKeys("33");
		Thread.sleep(3000);
	    grams.clear();
	    Thread.sleep(2000);
		grams.sendKeys("3");
		Thread.sleep(2000);
		bookingclick.click();
		Thread.sleep(2000);
		ammount.sendKeys("13800");
		continu.click();
		Thread.sleep(3000);
		feedback.sendKeys("good");
		star.click();
		submit.click();
	}
}
