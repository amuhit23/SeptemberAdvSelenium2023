package com.facebook.pageFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestName {
	WebDriver driver;
	
	// creating instance variables when using 'name' locator
	String userName="email";
	String passwordName="pass";  
	String loginButtonName="login";  
	
	@BeforeTest

	public void openFacebook() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

		driver.get("https://www.facebook.com/");

	}

	
	//@Test  Template: Alternative code by finfByID method instead of using driver.findElement By
		public void validLogin() {
			findByID("email").sendKeys("muhit");
			findByID("pass").sendKeys("fgjbg");   
			findByID("pass").click();
			
		}
		
		@Test // making instance variable for every name locator values to reduce using the same name locator value
				// values like email, pass for 3 jobs
		public void validLogin1() {
			findByID(userName).sendKeys("muhit");
			findByID(passwordName).sendKeys("fgjbg"); // 4th way to write code(best)
			findByID(loginButtonName).click();

		}

		@Test
		public void invalidLogin() {
			findByID(userName).sendKeys("muhit");
			findByID(passwordName).sendKeys("jhfj");
			findByID(loginButtonName).click();
		}

		@Test
		public void boundaryLoginTest() {
			findByID(userName).sendKeys("muhit");
			findByID(passwordName).sendKeys("jhfj");
			findByID(loginButtonName).click();
		}
	
	
	// 2nd Helper method 'findByName()'
	
	public WebElement findByID(String name) { // this is Korai; // helper method findBy method using for name locator
		return driver.findElement(By.name(name));
	}
}
