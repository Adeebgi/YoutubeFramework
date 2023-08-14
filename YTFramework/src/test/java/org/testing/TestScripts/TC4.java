package org.testing.TestScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC4 {
	
	static WebDriver driver;
	static Properties pro;
	static FileInputStream f ;
	
  
    public static void Property() throws IOException
	{
		//Read the properties 
		f=new FileInputStream("../YTFramework/config.properties");
		pro=new Properties();
		pro.load(f);
		//get the browser and url from properties 
		System.out.println( pro.getProperty("browser"));
		System.out.println( pro.getProperty("url"));
		
	}
    public static void InvokeBrowser() {
		if(pro.getProperty("browser").equals("chrome")) 
		{
			driver=new ChromeDriver(); 
		}
		else if(pro.getProperty("browser").equals("firefox"));
		{
			driver=new FirefoxDriver();
		}
	}
    
    
    @Test
  	public void Launch_LoginAPP() throws IOException {
    	Property();
    	InvokeBrowser();
  		driver.get(pro.getProperty("url"));
  	}
    
    
	
}
