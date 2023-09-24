package com.facebook.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathFuction {

WebDriver driver;
	
	@BeforeTest
	
	public void openFacebook() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6)); 
		
		driver.get("https://www.facebook.com/");
	} 
	
	@Test 
	
	public void linkText() {
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]")).click();
		
		/*
		 * //a[contains(text(),'Forgot password?')]
		 * Look out for these two things
		 * link= a; 
		 *    >Forgot password?< Text
		 */
	}
@Test 
	
	public void listText() {
		
		driver.findElement(By.xpath("//li[contains(text(),'English (US)')]")).click();
		
		/*
		 * //li[contains(text(),'English (US)')]
		 * Look out for these two things
		 * link= li; 
		 *    >English (US)< Text
		 */
	}
@Test
public void getText() {
	
	WebElement text=driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends')]"));
	
	//System.out.println(text.getText()); // get me the text from that link
	
	String actualText="Connect with friends and the world around you on Facebook.";
	
	Assert.assertEquals(actualText, text.getText(), "Did match");
	
}

	//@AfterTest
	
	public void closeFacebook() {
		
		driver.quit();
		
	}
	
	
}
