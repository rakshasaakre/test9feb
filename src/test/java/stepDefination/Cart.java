package stepDefination;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.setupWebDriver;
import io.cucumber.java.en.*;

public class Cart extends setupWebDriver {
	@Given("Click on menu")
	public void click_on_menu() throws IOException, InterruptedException {
		setup();
		driver.findElement(By.xpath("//a[contains(text(),'Login or register')]")).click();
		driver.findElement(By.id("loginFrm_loginname")).sendKeys("FirstNameOne");
		driver.findElement(By.id("loginFrm_password")).sendKeys("FirstNameOne");
		driver.findElement(By.xpath("//button[@title='Login']")).click();
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//nav[@class='subnav']/ul/li[2]"));
		a.moveToElement(move).build().perform();
		//div[@class='subcategories']/ul/li/a[contains(text(),'Shoes')]
		driver.findElement(By.xpath("//div[@class='subcategories']/ul/li/a[contains(text(),'Shoes')]")).click();
		Thread.sleep(3000);
	    
	}

	@Then("select the product")
	public void select_the_product() throws InterruptedException {
		//div[@class='subcategories']/ul/li/a[contains(text(),'Shoes')]
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.Scrollby(0,500)");
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='thumbnail']//i[1]")).click();
		//driver.findElement(By.xpath("//div[@class='subcategories']/ul/li/a[contains(text(),'Shoes')]")).click();
	    
	}

	@Then("Add the product to cart")
	public void add_the_product_to_cart() {
		//driver.findElement(By.xpath("//div[@class='thumbnail']//i[1]")).click();
		//option344747
		driver.findElement(By.id("option344747")).click();
	    
	}

	@Then("click on add to cart button")
	public void click_on_add_to_cart_button() {
		driver.findElement(By.xpath("//a[@class='cart']")).click();
	    
	}

	@Then("click on checkout")
	public void click_on_checkout() {

		driver.findElement(By.id("cart_checkout1")).click();
		System.out.println("click on checkout completed");
	    
	}

	@Then("Click on confirm order")
	public void click_on_confirm_order() {

		driver.findElement(By.id("checkout_btn")).click();
	   
	}

}
