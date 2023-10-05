package com.facebook.pageFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;
	String userNameId="email";
	String passWordId="pass";
	
	
	@BeforeTest

	public void openFacebook() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/");

	}
	
	//@Test
	public void validLogin() {
		driver.findElement(By.id(null)).sendKeys("");
		driver.findElement(By.id(null)).sendKeys("");
		driver.findElement(By.id(null)).click();
	}
	//@Test
	public void invalidLogin() {
		driver.findElement(By.id(null)).sendKeys("");
		driver.findElement(By.id(null)).sendKeys("");
		driver.findElement(By.id(null)).click();
	}
	@Test
	public void boundaryLoginTest() {
		findByID(userNameId).sendKeys("muhit");
		findByID(passWordId).sendKeys("jhfj");
	}
	
	public WebElement findByID(String id) { // this is Korai;
		return driver.findElement(By.id(id));
	}
}
