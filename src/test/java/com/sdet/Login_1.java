package com.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_1 {
	
	@Test
	public void Login() {
	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String text=driver.findElement(By.id("toPasswordRecoveryPageLink")).getText();
	Assert.assertEquals(text, "Forgot your password?");
         driver.close();
	}

}
