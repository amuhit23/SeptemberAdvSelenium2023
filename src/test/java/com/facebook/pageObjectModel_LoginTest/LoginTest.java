package com.facebook.pageObjectModel_LoginTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.facebook.pageObjectModel_LoginPages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	
	public LoginTest() { // This is the default constructor
		super();
		// TODO Auto-generated constructor stub
	}

	WebDriver driver;
	
//LoginPage loginPage=new LoginPage();


	@BeforeTest

	public void openFacebook() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/");

	}
	
	@Test
	public void validLoginTest() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.userName("fgd");
		loginPage.password("dfs");
		loginPage.clicklogInButton();
	
	}
	
	@Test
	public void invalidLoginTest() {
			LoginPage loginPage=new LoginPage(driver);
			loginPage.userName("123A");
			loginPage.password("jkfgj");
			loginPage.clicklogInButton();
		
	}
	
	public void closeApp() {
		if (driver !=null) {
		driver.quit();
	}

	}
}
