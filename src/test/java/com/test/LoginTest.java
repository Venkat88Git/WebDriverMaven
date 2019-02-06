package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\com\\test\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://gmail.com/");
	}
	
	@Test
	public void doLogin(){
		driver.findElement(By.name("identifier")).sendKeys("abc@gmail.com");
		/*driver.findElement(By.xpath("//*[@id=identifierNext']/content/span")).click();
		driver.findElement(By.name("password")).sendKeys("abc");*/
		System.out.println("LoginTest Passed");
	}
	
	@AfterSuite
	public void teadDown(){
		driver.quit();
	}

}
