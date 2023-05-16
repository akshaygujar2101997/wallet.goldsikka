package Createevent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Eventpom {
	WebDriver driver;
	@FindBy(xpath = "/html/body/app-root/main/app-app-layout/section/app-user-sidebar/nav/div[2]/div[2]/ul/li[7]/a")
	private WebElement event;

	@FindBy(xpath = "/html/body/app-root/main/app-app-layout/section/app-user-sidebar/nav/div[2]/div[2]/ul/li[7]/div/ul/li[1]/a")
	private WebElement xevent;

	@FindBy(xpath = "/html/body/app-root/main/app-app-layout/section/section/section/app-event-list/section/section/div[2]/a")
	private WebElement createevent;

	@FindBy(xpath = "/html/body/app-root/main/app-app-layout/section/section/section/app-event-create/div/div/div/div/div/form/div/div[1]/div[1]/select")
	private WebElement eventtype;

	@FindBy(xpath = "/html/body/app-root/main/app-app-layout/section/section/section/app-event-create/div/div/div/div/div/form/div/div[2]/div[1]/input")
	private WebElement eventname;

	@FindBy(xpath = "/html/body/app-root/main/app-app-layout/section/section/section/app-event-create/div/div/div/div/div/form/div/div[3]/div[1]/input")
	private WebElement eventsname;

	@FindBy(xpath = "/html/body/app-root/main/app-app-layout/section/section/section/app-event-create/div/div/div/div/div/form/div/div[4]/div[1]/input")
	private WebElement eventholder;

	@FindBy(xpath = "//input[@placeholder='Enter Venue']")
	private WebElement venue;

	@FindBy(xpath = "//textarea[@placeholder='Enter Description']")
	private WebElement description;

	@FindBy (xpath="//input[@placeholder=\"Enter Date\"]")
	private WebElement date;
	
	@FindBy (xpath="//input[@placeholder=\"Enter Time\"]")
	private WebElement time;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-event-create/div/div/div/div/div/form/div/div[10]/button")
	private WebElement submit;
	
	
	public Eventpom(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void event() 
	{
		event.click();
		xevent.click();
		createevent.click();
	}

	public void eventtype() 
	{
		Select s = new Select(eventtype);
		s.selectByIndex(2);
	}

	public void eventname() 
	{
		eventname.sendKeys("birthday");
		eventsname.sendKeys("birthday");
	}

	public void eventholder() 
	{
		eventholder.sendKeys("Akshay");
	}

	public void venue() 
	{
		venue.sendKeys("hydrabad");
		description.sendKeys("save the date");
	}

	public void date()
	{
		date.sendKeys("12-05-2023");
		time.sendKeys("12:37");
	}
	public void submit()
	{
		submit.click();
	}
}
