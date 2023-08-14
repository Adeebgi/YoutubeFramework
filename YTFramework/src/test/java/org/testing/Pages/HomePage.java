package org.testing.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {
	WebDriver driver;
	Properties pr;
	
	
	public HomePage(WebDriver driver, Properties pr) {
		this.driver=driver; 
		this.pr=pr;
	}
	
	public void Trending() throws InterruptedException {
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.cssSelector(pr.getProperty("search")));
		search.sendKeys("Trending Video");
		search.sendKeys(Keys.ENTER);
		 Assert.assertEquals("Trending Video", "Trending Video");
	}
	
	public void History() {
		WebElement gClick=driver.findElement(By.id(pr.getProperty("gClick")));
		gClick.click();
		//driver.findElement(By.xpath("//div[@id='start']//button[@id='button']//div")).click();
		List<WebElement> list = driver.findElements(By.xpath(pr.getProperty("list")));
		
		  for (int i = 0; i < list.size(); i++) {
		  System.out.println(list.get(i).getText()); 
		  if (list.contains("History")) {
		  list.get(i).click(); } String print = list.get(i).getText();
		  System.out.println(print); break; }
	}
}
