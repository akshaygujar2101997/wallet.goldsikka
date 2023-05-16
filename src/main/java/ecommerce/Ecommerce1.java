package ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Ecommerce1 
{
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/app-user-sidebar/nav/div[2]/div[2]/ul/li[6]/a")
	private WebElement ecom; 

	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/app-user-sidebar/nav/div[2]/div[2]/ul/li[6]/div/ul/li[1]/a")
	private WebElement home;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-ecommerce/section[1]/div/div[3]/div/div/div[1]/div/a/h3")
	private WebElement cat1;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-ecommerce/section[1]/div/div[3]/div/div/div[2]/div/a/h3")
	private WebElement cat2;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-ecommerce/section[1]/div/div[3]/div/div/div[3]/div/a/h3")
	private WebElement cat3;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-ecommerce/section[1]/div/div[3]/div/div/div[4]/div/a/h3")
	private WebElement cat4;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-ecommerce/section[1]/div/div[3]/div/div/div[5]/div/a/h3")
	private WebElement cat5;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-ecommerce/section[1]/div/div[3]/div/div/div[6]/div/a/h3")
	private WebElement cat6;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-ecommerce/section[1]/div/div[3]/div/div/div[7]/div/a/h3")
	private WebElement cat7;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-ecommerce/section[1]/div/div[1]/div[1]/div/input")
	private WebElement search;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-ecommerce/section[1]/div/div[3]/div/div/div/div")
	private WebElement necklace;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-category/div[1]/div[3]/div/form/select")
	private WebElement weightfilter;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-category/div[1]/div[4]/div/form/select")
	private WebElement pricefilter;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-category/div[2]/div/div[2]/div/div/div/a")
	private WebElement knowmore;
	
	@FindBy (xpath="//p[@class=\"ac-button\"]")
	private WebElement addtocart;
	
	@FindBy (xpath="//p[@class=\"af-button\"]")
	private WebElement addtofav;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/app-user-sidebar/nav/div[2]/div[2]/ul/li[6]/div/ul/li[2]/a")
	private WebElement favorite;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/app-user-sidebar/nav/div[2]/div[2]/ul/li[6]/div/ul/li[3]/a")
	private WebElement cartpage;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-cartpage/section/div[2]/div/div[3]/button")
	private WebElement checkout;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-checkout/div[1]/div/div/div[2]/section/div/form/div[2]/div/div/div[5]/input")
	private WebElement bookingacc;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-checkout/div[1]/div/div/div[2]/section/div/form/div[2]/div/div/div[7]/div/input")
	private WebElement rupees;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-checkout/div[1]/div/div/div[2]/section/div/form/div[2]/div/div/div[9]/button")
	private WebElement proceedtopay;
	
	
	
	
	public Ecommerce1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void ecom() throws InterruptedException
	{
		Thread.sleep(2000);
		ecom.click();
		Thread.sleep(2000);
		home.click();
		Thread.sleep(2000);
		String category1 = cat1.getText();
		String category2 = cat2.getText();
		String category3 = cat3.getText();
		String category4 = cat4.getText();
		String category5 = cat5.getText();
		String category6 = cat6.getText();
		String category7 = cat7.getText();
		

		System.out.println("Total categories present");
		System.out.println(category1);
		System.out.println(category2);
		System.out.println(category3);
		System.out.println(category4);
		System.out.println(category5);
		System.out.println(category6);
		System.out.println(category7);
		Thread.sleep(2000);
		search.sendKeys("necklace");
		Thread.sleep(2000);
		necklace.click();
	}
	
	public void filter() throws InterruptedException
	{
		Thread.sleep(2000);
		//Select s1=new Select(pricefilter);
		//s1.selectByIndex(5);

		Thread.sleep(2000);
		//Select s2=new Select(weightfilter);
		//s2.selectByIndex(2);		
		Thread.sleep(5000);		
		knowmore.click();
		Thread.sleep(9000);
		addtocart.click();
		Thread.sleep(2000);
		addtofav.click();
		Thread.sleep(2000);
		favorite.click();
		Thread.sleep(4000);
		cartpage.click();
		Thread.sleep(4000);
	}	
	
	public void checkout() throws InterruptedException
	{
		Thread.sleep(3000);
		checkout.click();
	}
	
	public void bookinacc() throws InterruptedException
	{
		Thread.sleep(3000);
		bookingacc.click();
		rupees.sendKeys("65029");
		Thread.sleep(2000);
		
	}
	
	public void proceedtopay() throws InterruptedException
	{
		Thread.sleep(2000);
		proceedtopay.click();
		
	}
}
