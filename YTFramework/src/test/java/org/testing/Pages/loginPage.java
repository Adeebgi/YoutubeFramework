package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class loginPage {
//if on the page i have 3 functionalities then i create three functionalities 
	public WebDriver driver;
	public Properties pr; 
	public loginPage(WebDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	public void Singin() throws InterruptedException {
		// the complete cod of SingIn you will write here. 
		//we require driver object for initializing browser and properties object for fetching of locator values 
	WebElement loginButn=driver.findElement(By.xpath(pr.getProperty("loginButn")));
		loginButn.click();

	WebElement email=	driver.findElement(By.id(pr.getProperty("email")));
	email.sendKeys("javajenkin031@gmail.com");
	WebElement nClick=driver.findElement(By.xpath(pr.getProperty("nClick")));
	nClick.click();
	Thread.sleep(10000);
	WebElement psws=driver.findElement(By.xpath(pr.getProperty("psws")));	
	psws.sendKeys("Javajenkin123");
	
	WebElement neClick=driver.findElement(By.xpath(pr.getProperty("neClick")));
	neClick.click();
	
	}
	
	
}
