package goldsuvidha1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class buygoldbokkingacc 
{
	WebDriver driver;
	@FindBy (xpath="//span[text()='Gold Suvidha']")
	private WebElement suvidha;
     
	@FindBy (xpath="//span[text()='Buy Gold']")
	private WebElement buygold;
	
	@FindBy (xpath="//input[@formcontrolname=\"quantity\"]")
	private WebElement grams;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-buy-gold/section/form/div[4]/input")
	private WebElement bacc;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-buy-gold/section/form/div[6]/div[1]/input")
	private WebElement rupees;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-buy-gold/section/form/div[9]/button")
	private WebElement proceed;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-transaction-successful/section/div[2]/div/div/div/form/div/div[1]/div/textarea")
	private WebElement feedback;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-transaction-successful/section/div[2]/div/div/div/form/div/div[2]/div/ul/label[2]")
	private WebElement star;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-transaction-successful/section/div[2]/div/div/div/form/div/div[3]/button")
	private WebElement submit;
	
	
	
	public buygoldbokkingacc(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void suvidha() throws InterruptedException
	{
		suvidha.click();
		Thread.sleep(2000);
		buygold.click();
	}
	public void gram() throws InterruptedException
	{
		Thread.sleep(2000);
		grams.sendKeys("3");
		Thread.sleep(2000);
		bacc.click();
		Thread.sleep(2000);
		rupees.sendKeys("13800");
	}
	public void proceed() throws InterruptedException
	{
		Thread.sleep(2000);
		proceed.click();
	}	
	public void feedback() throws InterruptedException
	{
		Thread.sleep(2000);
		feedback.sendKeys("good");
		Thread.sleep(2000);
		star.click();
		Thread.sleep(2000);
		submit.click();
	}	
}
