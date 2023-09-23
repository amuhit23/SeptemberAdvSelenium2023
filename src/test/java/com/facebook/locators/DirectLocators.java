package com.facebook.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DirectLocators {
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
	
	public void idLocatorsTest() {
		
		driver.findElement(By.id("email")).sendKeys("hill");;
		
		
	}
	
@Test
	
	public void nameLocatorsTest() {
		driver.findElement(By.name("pass")).sendKeys("jhdjfds");
		
	}
	
@Test

public void linkLocatorsTest() {
	driver.findElement(By.linkText("Forgot password?")).click();
	
	// <a href="https://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjk1MzY5Nzg3LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&amp;ars=facebook_login">Forgot password?</a>
	
	// Here tag== <a
	//   link test= > Forgot password? < (btwn two angle brackets > <) 
	
}

@Test

public void linkTestLocatorsTest() {
	
	
}	

@Test

public void partialLinkLocatorsTest() {
	
	// if link text is too big
	// if link text is has space in btwn
	// if link text is has number in btwn, then it is better to use Partial Link text
	
	driver.navigate().back();
	
	driver.findElement(By.partialLinkText("Forgot")).click();
}

}
