package feedback;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Feedback 
{
	  public static WebDriver driver;
	    public static JavascriptExecutor js;

	    @FindBy(xpath = "/html/body/app-root/main/app-app-layout/section/app-user-sidebar/nav/div[2]/div[2]/ul/li[11]/a/span")
	    private WebElement FeedBack;

	    
	    @FindBy(xpath = "//a[normalize-space()='Create Feed Back']")
	    private WebElement createFeedBack;

	    @FindBy(xpath = "//textarea[@placeholder='Enter Message']")
	    private WebElement Textfeild;

	    @FindBy(xpath = "//label[@for='lghalf-5']")
	    private WebElement clickonstar;

	    @FindBy(xpath = "//button[normalize-space()='Continue']")
	    private WebElement clickoncontinous;

	    public Feedback(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void clickonCreateFeedBackBtn() throws InterruptedException {
	        Thread.sleep(3000);

	        FeedBack.click();
	        createFeedBack.click();

	    }

	    public void EnterTextFeild() throws InterruptedException {
	        Thread.sleep(3000);
	        Textfeild.sendKeys("This very good platForm");

	    }

	    public void GivenStar() throws InterruptedException {
	        Thread.sleep(3000);
	        Actions action = new Actions(driver);

	        action.moveToElement(clickonstar).click().build().perform();
	    }

	    public void clickoncontionubtn() throws InterruptedException {
	        Thread.sleep(3000);
	        clickoncontinous.click();
	    }
}
