package com.w2a.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	@Test
	public void logintest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
	    driver.get("http://practice.automationtesting.in/my-account/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("pavanoltraining");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Test@selenium123");
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
		//ADD new comments

		
		driver.close();
}
}