package com.mavenProject.GitSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginClass {
	WebDriver driver;



public LoginClass(WebDriver driver2) {
		driver=driver2;
	}



public void Loginmethod()
{
	 WebElement emailid= driver.findElement(By.id("email"));
      emailid.sendKeys("snehal2@gmail.com");
      WebElement password= driver.findElement(By.id("passwd"));
      password.sendKeys("qwerty");
      WebElement signin= driver.findElement(By.id("SubmitLogin"));
      signin.click();
	/*WebElement signin= driver.findElement(By.xpath("(//a[@title='Log in to your customer account'])"));
	signin.click();*/
}
}