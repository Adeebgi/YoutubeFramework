package org.testing.TestScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC2 extends Base{


	@Test
	public void LoginYouTube() throws InterruptedException {
		WebElement loginButn=driver.findElement(By.xpath(pr.getProperty("loginButn")));
		loginButn.click();
		/*
		 * Scanner sc=new Scanner(System.in); sc.next(email);
		 */
	WebElement email=	driver.findElement(By.id(pr.getProperty("email")));
	email.sendKeys("javajenkin031@gmail.com");
	WebElement nClick=driver.findElement(By.xpath(pr.getProperty("nClick")));
	nClick.click();
	Thread.sleep(10000);
	WebElement psws=driver.findElement(By.xpath(pr.getProperty("psws")));	
	psws.sendKeys("Javajenkin123");
	
	WebElement neClick=driver.findElement(By.xpath(pr.getProperty("neClick")));
	neClick.click();
//		Locate the History
		
		 
	}

	
}
