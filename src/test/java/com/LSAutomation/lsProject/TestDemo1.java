package com.LSAutomation.lsProject;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDemo1 {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/sellappan/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	
	@Test
	public void Test1() {
		driver.navigate().to("https://automationtalks.com");
		System.out.println("Title 1: " + driver.getTitle());
	}
	
	public void Test2() {
		driver.navigate().to("https://automationtalks.com");
		System.out.println("Title 2: " + driver.getTitle());
	}
	
	public void Test3() {
		driver.navigate().to("https://automationtalks.com");
		System.out.println("Title 3: " + driver.getTitle());
	}
	
	@AfterMethod
	public void closeBrowser() {
	//	driver.quit();
	}
}
