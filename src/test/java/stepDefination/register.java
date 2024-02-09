package stepDefination;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

import Base.setupWebDriver;
import io.cucumber.java.en.*;
import pageobejct.registerpageobject;

public class register extends setupWebDriver {

	registerpageobject regobj = new registerpageobject(driver);

	@Given("click on register")
	public void click_on_register() throws IOException, InterruptedException {

		setup();
		
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// Click on Login or Register
		// Find 'Login or Register' element by xpath and click on it
		driver.findElement(By.xpath("//a[contains(text(),'Login or register')]")).click();

	}

	@Then("click on continue")
	public void click_on_continue() {
		// Find 'Coninue' button and click on it

		driver.findElement(By.xpath("//button[@title='Continue']")).click();
	}

	@Then("Enter the Personal Details")
	public void enter_the_personal_details() {
		// AccountFrm_firstname,AccountFrm_lastname
		driver.findElement(By.id("AccountFrm_firstname")).sendKeys("FirstNameOne");
		driver.findElement(By.id("AccountFrm_lastname")).sendKeys("LastNameOne");
		driver.findElement(By.cssSelector("#AccountFrm_email")).sendKeys("FirstNameOne@Ggmail.com");
	}

	@Then("Enter the Address")
	public void enter_the_address() {
		// Entering Address now
		driver.findElement(By.cssSelector("#AccountFrm_address_1")).sendKeys("999");
		driver.findElement(By.cssSelector("#AccountFrm_city")).sendKeys("ABCDCity");
		WebElement regionDropdown = driver.findElement(By.cssSelector("#AccountFrm_zone_id"));
		Select dropdownSelection = new Select(regionDropdown);
		// dropdownSelection.selectByIndex(2);
		dropdownSelection.selectByVisibleText("Somerset");
		driver.findElement(By.cssSelector("#AccountFrm_postcode")).sendKeys("44444");
	}

	@Then("Enter the LoginDetails")
	public void enter_the_login_details() {
		// Enter postcode ,login , password and confirm password
		driver.findElement(By.cssSelector("#AccountFrm_postcode")).sendKeys("44444");
		driver.findElement(By.cssSelector("#AccountFrm_loginname")).sendKeys("FirstNameOne");
		driver.findElement(By.cssSelector("#AccountFrm_password")).sendKeys("FirstNameOne");
		driver.findElement(By.cssSelector("#AccountFrm_confirm")).sendKeys("FirstNameOne");
	}

	@Then("Enter the Newsletter")
	public void enter_the_newsletter() {
		driver.findElement(By.cssSelector("#AccountFrm_agree")).click();
	}

	@Then("Click Continue")
	public void click_continue() {
		driver.findElement(By.xpath("//button[@title='Continue']")).click();
	}

}
