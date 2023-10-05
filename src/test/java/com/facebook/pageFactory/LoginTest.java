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
	String userNameId="email"; // creating instance variable for usename's id locator
	String passWordId="pass";  // creating instance variable for password's id locator
	
	
	@BeforeTest

	public void openFacebook() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/");

	}
	
	// Problem here: we are using 'driver.findElement' again and again. too many times. So we are gonna use 'findBy' method to replace using the same codes over and over. 
	// to do that we create a findById method like this "public WebElement findByID ()", and to test that method we will create a test method, @Test method to call that findById method  
	// then, we also repeatedly were using the same locators or webElement id "email" for username; id "pass" for password; id "pass" for click button.  
	// How about we create a instance variable 'WebDriver driver' and use again and again.
	// to o that we name it like this : "email" = userNameId, and this is a String data type; so it looks like String userNameId="email"; String passWordID="pass"; 
	
	//@Test
	public void validLogin() {
		driver.findElement(By.id(null)).sendKeys("");
		driver.findElement(By.id(null)).sendKeys(""); // basic code structure
		driver.findElement(By.id(null)).click();
	}
	
	//@Test // previous driver.findByElement method (long repeated code lines)
		public void validLogin2() {
			driver.findElement(By.id("email")).sendKeys("muhit");   // 2nd type of writing code
			driver.findElement(By.id("pass")).sendKeys("fgjbg");
			driver.findElement(By.id("pass")).click();
		}
	
	//@Test  Alternative code by finfByID method
		public void validLogin3() {
			findByID("email").sendKeys("muhit");
			findByID("pass").sendKeys("fgjbg");            // 3rd type of writing code (good)
			findByID("pass").click();
			
		}
		
		//@Test  making instance variable for every ID values to reduce using the same ID values like email, pass for 3 jobs
				public void validLogin4() {
					findByID(userNameId).sendKeys("muhit");
					findByID(passWordId).sendKeys("fgjbg");  // 4th way to write code(best)
					findByID(passWordId).click();
					
				}
		
	//@Test
	public void invalidLogin() {
		driver.findElement(By.id("email")).sendKeys("muhit");
		driver.findElement(By.id("pass")).sendKeys("fgjbg");
		driver.findElement(By.id("pass")).click();
	}
	
	//@Test  // Alternative code by finfByID method 
		public void invalidLogin2() {
			findByID("email").sendKeys("muhit");
			findByID("pass").sendKeys("fgjbg");
			findByID("pass").click();
		}
		
	@Test   
		public void invalidLogin3() {
			findByID(userNameId).sendKeys("muhit");
			findByID(passWordId).sendKeys("jhfj");
			//findByID("pass").click();
		}
	
	@Test
	public void boundaryLoginTest() {
		findByID(userNameId).sendKeys("muhit");
		findByID(passWordId).sendKeys("jhfj");
		//findByID("pass").click();
	}
	
	
	// original Helper method 'findByID()'
	
	public WebElement findByID(String id) { // this is Korai; // helper method findBy method using for id locator
		return driver.findElement(By.id(id));
	}
}
