package org.testing.TestScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testing.Base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC3 extends Base {

	@Test
	public void Subscription() throws IOException, InterruptedException {
		WebElement loginButn = driver.findElement(By.xpath(pr.getProperty("loginButn")));
		loginButn.click();
		/*
		 * Scanner sc=new Scanner(System.in); sc.next(email);
		 */
		WebElement email = driver.findElement(By.id(pr.getProperty("email")));
		email.sendKeys("javajenkin031@gmail.com");
		WebElement nClick = driver.findElement(By.xpath(pr.getProperty("nClick")));
		nClick.click();
		Thread.sleep(10000);
		WebElement psws = driver.findElement(By.xpath(pr.getProperty("psws")));
		psws.sendKeys("Javajenkin123");

		WebElement neClick = driver.findElement(By.xpath(pr.getProperty("neClick")));
		neClick.click();
		// subscription 
		Thread.sleep(2000);
		WebElement subscription = driver.findElement(By.xpath(pr.getProperty("subscription")));
		subscription.click();
		Thread.sleep(2000);
		// driver.findElement(By.cssSelector("ytd-button-renderer[class='style-scope
		// ytd-background-promo-renderer']
		// div[class='yt-spec-touch-feedback-shape__fill']")).click();
	}

}
