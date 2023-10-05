package com.facebook.pom_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory {
	WebDriver driver;

	public LoginPageWithPageFactory(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this); //is handling public WebElement findByID(String id) {
		// return driver.findElement(By.id(id));
	}
	@FindBy(how=How.ID, using="email") WebElement userNameId;
	
	public WebElement userNameMethod(enterYourUserName) {
		
		driver.findElement(By.id("email"));
		
		userNameId.sendKeys(By.id("muhit"));
		
	}
	
	@FindBy(how=How.NAME, using="pass")WebElement passwordLocator;
	
	public WebElement passwordMethod(String eneterYourPassword) {
		WebElement passwordLocator;
		passwordLocator.sendKeys("String eneterYourPassword");
		return passwordLocator;
		
	}
	
	
}
