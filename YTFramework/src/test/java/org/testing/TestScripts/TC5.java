package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testng.annotations.Test;

public class TC5 extends Base{

	@Test
	public void youTubePlay() throws InterruptedException {
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
	
	Thread.sleep(2000);
	driver.navigate().to("https://www.youtube.com/watch?v=rSc_K7KjEGo");
	WebElement Chansub=driver.findElement(By.cssSelector(pr.getProperty("Chansub")));
	Chansub.click();
	Thread.sleep(10000);
	WebElement fuScreen=driver.findElement(By.xpath(pr.getProperty("fuScreen")));
	fuScreen.click();
	Thread.sleep(10000);
	
	
}
}
