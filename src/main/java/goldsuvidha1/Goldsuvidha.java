package goldsuvidha1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Goldsuvidha
{
	WebDriver driver;
	@FindBy (xpath="//span[text()='Gold Suvidha']")
	private WebElement suvidha;
     
	@FindBy (xpath="//span[text()='Buy Gold']")
	private WebElement buygold;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-buy-gold/section/form/div[1]/div[1]/input")
	private WebElement ammount;
	
	@FindBy (xpath="//input[@formcontrolname=\"quantity\"]")
	private WebElement grams;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-buy-gold/section/form/div[8]/button")
	private WebElement purchasegold;
	
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[2]/div[1]/div[1]/div/div/div[2]/div/div/div[2]/input")
	private WebElement number;
	
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[4]/div/button")
	private WebElement continu;
	
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[2]/div[1]/div[1]/div[1]/div/div/div[2]/div/button[3]/div")
	private WebElement netbank;
	
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[2]/div[5]/div[1]/div/div/div[1]/div[2]/label")
	private WebElement icici;
	
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[4]/div[2]/button")
	private WebElement paynow;
	
	@FindBy (xpath="/html/body/form/button[1]")
	private WebElement success;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-with-draw/section/section/div/div[2]/div/div/div/form/div[1]/div[1]/textarea")
	private WebElement feedback;
	
	@FindBy (xpath="//label[text()='4 stars']")
	private WebElement star;
	
	@FindBy (xpath="//button[@class=\"btn btn-save btn-outline-dark post_btn\"]")
	private WebElement submitfeedback;
	
	
	
	public Goldsuvidha(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void GoldSuvidha1() throws InterruptedException
	{
		suvidha.click();
		Thread.sleep(2000);
		buygold.click();
		ammount.sendKeys("50");
		Thread.sleep(3000);
		ammount.clear();
		grams.clear();
		Thread.sleep(2000);
		grams.sendKeys("32");
		Thread.sleep(3000);
		grams.clear();
		grams.sendKeys("3");
	}	
	public void GoldSuvidha2() throws InterruptedException
	{
		Thread.sleep(2000);
		purchasegold.click();
	}
	public void GoldSuvidha3() throws InterruptedException
	{
		Thread.sleep(5000);
		number.sendKeys("9100345025");
		Thread.sleep(2000);
		continu.click();
		Thread.sleep(2000);
		netbank.click();
		icici.click();
	}
	public void GoldSuvidha4() throws InterruptedException
	{
	    Thread.sleep(2000);
		paynow.click();
//		success.click();
//		feedback.sendKeys("good");
//		star.click();
//		submitfeedback.click();	
		
	}
	public void Goldsuvidha5() throws InterruptedException
	{
		Thread.sleep(9000);
		feedback.sendKeys("good");
		star.click();
		submitfeedback.click();
	}
}