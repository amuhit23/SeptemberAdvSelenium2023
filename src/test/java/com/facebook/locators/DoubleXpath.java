package com.facebook.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleXpath {

WebDriver driver;
	
	@BeforeTest
	
	public void openFacebook() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	
	// username test
	public void doubleXpathTest() {
		
		driver.findElement(By.xpath("//input[@id='email'] [@name='email']")).sendKeys("yoggi");
	// by default "and Condition"
	}
	
	@Test
	// password test
	public void orCondition() {
		
		driver.findElement(By.xpath("//input[@id='pass'or @name='pass1']")).sendKeys("123kkk");
		// either one of the locator has to be right. here 2nd locator name is wrong but it's working for the 1st correct Locator
	}
@Test
	// login test
	public void andCondition() {
		// both locator has to be right
		driver.findElement(By.xpath("//button[@name='login' and @class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		
		
	}
}
