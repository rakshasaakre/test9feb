package pageobejct;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class registerpageobject {
	WebDriver driver;

	public registerpageobject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}

	@FindBy (xpath = "//a[contains(text(),'Login or register')]")	
	WebElement LoginorRegisterButton;

	@FindBy (xpath = "//button[@title='Continue']")
	WebElement clickoncontinue;

	@FindBy (id = "AccountFrm_firstname")
	WebElement Firstname;
	
	@FindBy (id = "AccountFrm_lastname")
	WebElement Lastname;

	@FindBy (id = "AccountFrm_email")
	WebElement gmail;
	
	
	@FindBy (id = "AccountFrm_telephone")
	WebElement telephone;
	
	@FindBy (id = "AccountFrm_fax")
	WebElement fax;
	
	@FindBy (id = "AccountFrm_company")
	WebElement company;
	
	@FindBy (id = "AccountFrm_address_1")
	WebElement address1;
	
	@FindBy (id = "AccountFrm_city")
	WebElement City;
	
	@FindBy (id = "AccountFrm_zone_id")
	WebElement regionDropdown;
	
	@FindBy (xpath = "//*[@id=\"AccountFrm_postcode\"]")
	WebElement zipcode;
	
	@FindBy (id = "AccountFrm_country_id")
	WebElement Country;
	
	@FindBy (id = "AccountFrm_loginname")
	WebElement Login;
	
	@FindBy (id = "AccountFrm_password")
	WebElement password;
	
	
	
	public void LoginRegister()
	{
		
		LoginorRegisterButton.click();
	}
	
	public void clickRegister()
	{
		
		clickoncontinue.click();
	}

	public void setFirstname(String FName)
	{
		
		Firstname.sendKeys(FName);
	}
	
	public void setLasttname(String LName)
	{
		
		Lastname.sendKeys(LName);
	}
	
	public void email(String mail)
	{
		
		gmail.sendKeys(mail);
	}
	
	public void phone(String phone)
	{
		
		telephone.sendKeys(phone);
	}
	public void Fax(String Fax)
	{
		
		fax.sendKeys(Fax);
	}
	public void company(String comp)
	{
		
		address1.sendKeys(comp);
	}
	
	public void address(String ad1)
	{
		
		Firstname.sendKeys(ad1);
	}
	
	public void city(String city)
	{
		
		City.sendKeys(city);
	}
	public void state(String state)
	{
		
		regionDropdown.sendKeys(state);
	}
	
	public void zipcode(String zip)
	{
		
		regionDropdown.sendKeys(zip);
	}
	
	public void country(String coutry)
	{
		
		Country.sendKeys(coutry);
	}
	
	public void passwordRegister(String loginpassword)
	{
		
		password.sendKeys(loginpassword);
	}
	
	@FindBy (id = "AccountFrm_confirm")
	WebElement confirm;
	
	public void passwordconfirm(String loginpasswordconfirm)
	{
		
		confirm.sendKeys(loginpasswordconfirm);
	}
	
	@FindBy (id = "AccountFrm_agree")
	WebElement agree;
	
	public void clickagree()
	{
		
		agree.click();
	}
	
	@FindBy (xpath = "//button[@title='Continue']\"")
	WebElement continuesignup;
	
	public void clickcontinuesignup()
	{
		
		continuesignup.click();
	}
	
}
