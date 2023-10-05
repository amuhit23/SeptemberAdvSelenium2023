package com.facebook.pom_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory {
	WebDriver driver;

	public LoginPageWithPageFactory(WebDriver driver) {
		super();
		this.driver = driver; // This will come after highlighting the driver, right click > source> generate
								// constructor using fields> generate

		PageFactory.initElements(driver, this); // is handling public WebElement findByID(String id) {
		// return driver.findElement(By.id(id));
	}

	/*
	 * Formula = @FindBy annotation (how=How.locator name or attributes, using
	 * Values of the locators/xpath/css) data type and variable name Variable name
	 * Variable name is = userNameId; a Variable must need a data type (such as WebElement) Data type of ID locator
	 * data type= WebElement
	 */

	@FindBy(how = How.ID, using = "email") WebElement userNameId; // @FindBy kibhabe khujbe, How.id using value- "email"

	public WebElement userNameMethod(String enterYourUsename) {
		// driver.findElement(By.id("email")); this line is same as next line
		userNameId.sendKeys(enterYourUsename); // userNameId.sendKeys("muhit");
		return userNameId;

	}

	@FindBy(how = How.NAME, using = "pass")
	WebElement passwordLocator;

	public WebElement passWordMethod(String enterYourPassword) {
		passwordLocator.sendKeys("enterYourPassword");
		return passwordLocator;

	}

	@FindBy(how=How.XPATH, using="//button[@name='login']") private WebElement loginButtonLocators;
	
	public void loginButton() {
		loginButtonLocators.click();
	}
}
