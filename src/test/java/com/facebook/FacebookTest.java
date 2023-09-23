package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {
	
	WebDriver driver; 	// instance variable


	@Test
	
	public void testOne() {
		
	System.out.println("hello testNg");	
		
	}
	@Test  // 1. Open Browser
	
	public void oepenChromeBrowser() {
		
	WebDriverManager.chromedriver().setup();
	
		driver=new ChromeDriver();
		
		 // 2. Open a new application like FB
		
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	
	public void openEdgeBrowser() {
		
		WebDriverManager.edgedriver().setup();
			
			driver=new EdgeDriver();
			driver.get ("https://www.facebook.com/");

	}
	@Test
	
	public void openSafariDriver() {
		WebDriver driver= new SafariDriver();
		
		driver.get("https://www.facebook.com/");
		
	}
	
}
