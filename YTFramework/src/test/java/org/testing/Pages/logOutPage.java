package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class logOutPage {
	public WebDriver driver;
	public Properties pr;
	

	public logOutPage(WebDriver driver, Properties pr) {
		this.driver=driver; 
		this.pr=pr;
	}
	
	public void SIgnOut() throws InterruptedException {
		WebElement Oclick=driver.findElement(By.xpath(pr.getProperty("Oclick")));
		Oclick.click();
		
		WebElement tClick=driver.findElement(By.xpath(pr.getProperty("tClick")));
		tClick.click();
	}

}
