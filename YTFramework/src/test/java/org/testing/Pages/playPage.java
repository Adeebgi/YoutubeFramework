package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class playPage {
	public WebDriver driver;
	public Properties pr;
	

	public playPage(WebDriver driver, Properties pr) {
		this.driver=driver; 
		this.pr=pr;
	}
	
	public void play() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().to("https://www.youtube.com/watch?v=NeVnBkTSibk");
		//WebElement Chansub=driver.findElement(By.cssSelector(pr.getProperty("Chansub")));
		//Chansub.click();
		Thread.sleep(10000);
		WebElement fuScreen=driver.findElement(By.xpath(pr.getProperty("fuScreen")));
		fuScreen.click();
		Thread.sleep(10000);
	}
	
	

}
