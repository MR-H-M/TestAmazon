package com.MavenTest;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonTest {
	@Test
	  public void ChromeTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		System.out.println("Current Url of Chrome browser: "+driver.getCurrentUrl());
	}
	@Test
	  public void EdgeTest() {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		System.out.println("Current Url of Edge browser: "+driver.getCurrentUrl());
	}
	@Test
	  public void FireFoxTest() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		System.out.println("Current Url of Firefox browser: "+driver.getCurrentUrl());
	}
}