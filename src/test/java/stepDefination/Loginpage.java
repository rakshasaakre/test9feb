package stepDefination;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.setupWebDriver;
import io.cucumber.java.en.*;

public class Loginpage extends setupWebDriver {
	
	
	@Given("Click main Register Button")
	public void click_main_register_button() throws IOException {
		setup();
		driver.manage().window().maximize();		
		
		driver.findElement(By.xpath("//a[contains(text(),'Login or register')]")).click();
				
	}

	@Then("Enter the username and password")
	public void enter_the_username_and_password() {
		driver.findElement(By.id("loginFrm_loginname")).sendKeys("FirstNameOne");
		driver.findElement(By.id("loginFrm_password")).sendKeys("FirstNameOne");
	}

	@Then("Enter Login")
	public void enter_login() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Login']")));
		driver.findElement(By.xpath("//button[@title='Login']")).click();
		
		
	}
}
