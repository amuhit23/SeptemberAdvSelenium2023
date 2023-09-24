package com.facebook.findElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {

	WebDriver driver;

	@BeforeMethod

	public void openFacebook() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/");
	}

	@Test // FIND Elements in shortcut in one command or line
	// What happens if you have more than 1 elements?

	public void listofElements() {
		List<WebElement> languagesList = driver.findElements(By.xpath("//div[@id='pageFooter']/ul/li")); // this
																											// includes
																											// all the
																											// webElements

		for (WebElement language : languagesList) {
			System.out.println(language.getText()); // it brings all the language list the fb page has in the command
													// console
		}
// Xpath traverse = //div[@id='pageFooter']/ul/li  (travelling from top to bottom)

// find elements method= List<WebElement> languagesList= driver.findElements(By.xpath("//div[@id='pageFooter']/ul/li")); // this includes all the webElements
//for each loop= for (WebElement language : languagesList)

		// What is findElemets
		// What is the data types of the find elements
		// What is the list <WebElement>
		// What is loop
		// What is each loop
		// What is for/while/do loop

		for (int i = 0; i < 12; i++) { // i here means language

			System.out.println(i);
		}

	}

}
