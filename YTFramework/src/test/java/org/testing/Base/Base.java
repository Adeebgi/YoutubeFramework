package org.testing.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public ChromeDriver driver;
	public Properties pr;

	
	@BeforeMethod
	public void InvokeBrowser( ) throws IOException {
		
		File f=new File("../YTFramework/object.properties");
		FileReader fr=new FileReader(f);
		pr=new Properties(); 
		pr.load(fr);
		/*
		 * if (browser.equalsIgnoreCase("Chrome")) { driver = new ChromeDriver(); } else
		 * if (browser.equalsIgnoreCase("Firefox")) { driver = new FirefoxDriver(); }
		 */
		 
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
	}
	
	
	@AfterMethod
	public void CloseBrowser()
	{
	driver.close();
	}
}