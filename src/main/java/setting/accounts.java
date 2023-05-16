package setting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class accounts 
{
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/app-user-sidebar/nav/div[2]/div[2]/ul/li[13]/a")
	private WebElement setting;
	
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/section/div/div/a[1]")
	private WebElement account;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-account-profile-settings/div/section/div/div/form/div/div[1]/input")
	private WebElement name;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-account-profile-settings/div/section/div/div/form/div/div[3]/input")
	private WebElement email;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-account-profile-settings/div/section/div/div/form/div/div[3]/input")
	private WebElement umobile;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-account-profile-settings/div/section/div/div/form/div/div[4]/button")
	private WebElement submitprofile;
	
	
	
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/section/div/div/a[2]")
	private WebElement kyc;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-account-kyc-settings/div/section/div[2]/div[1]/button")
	private WebElement update;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-account-kyc-settings/div/section/div[2]/form/div/div[1]/input")
	private WebElement fathername;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-account-kyc-settings/div/section/div[2]/form/div/div[2]/input")
	private WebElement spousename;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-account-kyc-settings/div/section/div[2]/form/div/div[3]/input")
	private WebElement alternumber;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-account-kyc-settings/div/section/div[2]/form/div/div[4]/input")
	private WebElement pannumber;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-account-kyc-settings/div/section/div[2]/form/div/div[5]/input")
	private WebElement adharnumber;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-account-kyc-settings/div/section/div[2]/form/div/div[6]/label[2]")
	private WebElement male;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-account-kyc-settings/div/section/div[2]/form/div/div[7]/button")
	private WebElement submitkyc;
	
	
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/section/div/div/a[3]")
	private WebElement nominee;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-nominee-list/div/section/div[2]/a")
	private WebElement addnominee;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-nominee-add/div/section/div/form/div/div[1]/input")
	private WebElement nomineename;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-nominee-add/div/section/div/form/div/div[2]/input")
	private WebElement nomineenumber;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-nominee-add/div/section/div/form/div/div[3]/textarea")
	private WebElement nomineeaddress;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-nominee-add/div/section/div/form/div/div[4]/input")
	private WebElement nomineecity;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-nominee-add/div/section/div/form/div/div[5]/div/div[1]/select")
	private WebElement nomineestate;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-nominee-add/div/section/div/form/div/div[5]/div/div[2]/select")
	private WebElement nomineecountry;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-nominee-add/div/section/div/form/div/div[6]/div/div[1]/input")
	private WebElement nomineepincode;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-nominee-add/div/section/div/form/div/div[6]/div/div[2]/select")
	private WebElement relation;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-nominee-add/div/section/div/form/div/div[7]/button")
	private WebElement nomineesubmit;
	
	
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/section/div/div/a[4]")
	private WebElement address;

	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-address-list/div/section/div[2]/a")
	private WebElement addnewaddress;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-address-add/div/section/div/form/div/div[1]/input")
	private WebElement addresstitle;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-address-add/div/section/div/form/div/div[2]/textarea")
	private WebElement uaddress;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-address-add/div/section/div/form/div/div[3]/input")
	private WebElement ucity;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-address-add/div/section/div/form/div/div[4]/div/div[1]/select")
	private WebElement ustate;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-address-add/div/section/div/form/div/div[4]/div/div[2]/input")
	private WebElement upincode;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-address-add/div/section/div/form/div/div[5]/button")
	private WebElement submitaddress;
	
	
	
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/section/div/div/a[5]")
	private WebElement bankacc;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-bank-account-list/div/section/div[2]/a")
	private WebElement addnewacc;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-bank-account-add/div/section/form/div[1]/input")
	private WebElement accname;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-bank-account-add/div/section/form/div[2]/input")
	private WebElement accnumber;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-bank-account-add/div/section/form/div[3]/input")
	private WebElement bankname;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-bank-account-add/div/section/form/div[4]/input")
	private WebElement branch;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-bank-account-add/div/section/form/div[5]/input")
	private WebElement ifsccode;
	
	@FindBy (xpath="/html/body/app-root/main/app-app-layout/section/section/section/app-setting-layout/div/div/div/div/div/section/div/app-bank-account-add/div/section/form/div[6]/button")
	private WebElement submitbankdetails;
	
	
	
	
	
	
	
	public accounts(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	public void setting() throws InterruptedException
	{
		Thread.sleep(2000);
		setting.click();
		Thread.sleep(2000);
		account.click();
		name.clear();
		name.sendKeys("shiv");
		email.clear();
		email.sendKeys("shiv123@gmail.com");
		umobile.clear();
		umobile.sendKeys("9100345025");
		submitprofile.click();
	}
	public void kyc() throws InterruptedException
	{
		Thread.sleep(2000);
		kyc.click();
		update.click();
		Thread.sleep(2000);
		fathername.clear();
		fathername.sendKeys("xyz");
		spousename.clear();
		spousename.sendKeys("xyz");
		alternumber.clear();
		alternumber.sendKeys("1111221111");
		pannumber.clear();
		pannumber.sendKeys("asdfg1234a");
		adharnumber.clear();
		adharnumber.sendKeys("123456789012");
		male.click();
	}
	
	public void submitkyc()
	{
		submitkyc.click();
	}
	
	public void nominee() throws InterruptedException
	{
		Thread.sleep(2000);
		nominee.click();
		Thread.sleep(2000);
		addnominee.click();
		nomineename.sendKeys("shiva");
		nomineenumber.sendKeys("1234567890");
		nomineeaddress.sendKeys("hydrabad");
		nomineecity.sendKeys("hydrabad");
		Thread.sleep(2000);
		Select s1=new Select(nomineestate);
		s1.selectByVisibleText("Telangana");
		Thread.sleep(2000);
		Select s2=new Select(nomineecountry);
		s2.selectByVisibleText("India");
		nomineepincode.sendKeys("500006");
		Thread.sleep(2000);
		Select s3=new Select(relation);
		s3.selectByVisibleText("Brother");
		Thread.sleep(2000);
	}
	public void nomineesubmit()
	{
	nomineesubmit.click();
	}
	public void address() throws InterruptedException
	{
		Thread.sleep(2000);
		address.click();
		Thread.sleep(2000);
		addnewaddress.click();
		addresstitle.sendKeys("permanant");
		uaddress.sendKeys("Hydrabad");
		ucity.sendKeys("hydrabad");
		Thread.sleep(2000);
		Select s1=new Select(ustate);
		s1.selectByVisibleText("Telangana");
		Thread.sleep(2000);
		upincode.sendKeys("560007");
		submitaddress.click();
	}
	public void bank() throws InterruptedException
	{
		Thread.sleep(2000);
		bankacc.click();
		Thread.sleep(2000);
		addnewacc.click();
		accname.sendKeys("shiva");
		accnumber.sendKeys("22222222222");
		bankname.sendKeys("icici");
		branch.sendKeys("hydrabad");
		ifsccode.sendKeys("ASDF0000557");
	}
	public void submitbankdetails()
	{
	submitbankdetails.click();
	}
	
}
