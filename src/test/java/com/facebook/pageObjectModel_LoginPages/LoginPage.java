package com.facebook.pageObjectModel_LoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	/**
	 * / instance variable
	 */
	WebDriver driver;  
	/**
	 * @param driver
	 * user define constructor for POM
	 */
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this); // this line is designed / build for POM
		
	}
	public WebElement userName(String enterYouruserName) {
		
		WebElement uName=driver.findElement(By.cssSelector("#email")); // basic code
		uName.clear();
		uName.sendKeys(enterYouruserName);
		
		return uName;
		
	}
	
	public WebElement password(String enteryouPassword) {
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		pass.clear();
		pass.sendKeys(enteryouPassword);
		System.out.println("what is the tag name" + pass.getTagName());
		return pass;
		
	}

	public void clicklogInButton() {
		
		//driver.findElement(By.name("login")).click();
		
		WebElement loginButton=driver.findElement(By.name("login"));
		loginButton.click();
	}
	
	public WebElement forgetPassword() {
		
		WebElement forgetPass=driver.findElement(By.linkText("Forgot password?"));
		forgetPass.click();
		return forgetPass;
		
	}
	public WebElement createNewAccount() {
		
		WebElement newAccount=driver.findElement(By.linkText("Create new account"));
		newAccount.click();
		
		return null;
		
		
	}
	
}
