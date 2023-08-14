package org.testing.TestScripts;

import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.logOutPage;
import org.testing.Pages.loginPage;
import org.testing.Pages.playPage;
import org.testing.Utilities.LogsCapture;
import org.testing.Utilities.ScreenShotCapture;
import org.testing.assertions.Asserts;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC1 extends Base {
	
 
	@Test
	public void Login() throws InterruptedException, IOException, ClassNotFoundException
	{
		loginPage ln=new loginPage(driver,pr);
		ln.Singin();
		ScreenShotCapture.takegScreenshot(driver, "C:\\Users\\User\\eclipse-workspace\\YTFramework\\ScreenShot\\first.png");
		LogsCapture.takeLogs("loginPage", "login successfully for loginPage");
		
		//This Hard Assertions: if hard assertion fail, code will not execude furthermore;
		// Hard assertions is given by testng. 
		//Assert.assertEquals(driver.getCurrentUrl(), "https://www.youtube.com/");
		Asserts.assert1(driver.getCurrentUrl(), "https://www.youtube.com/");
		HomePage hp=new HomePage(driver, pr);
		hp.Trending();
		playPage pp=new playPage(driver,pr);
		pp.play();
		logOutPage lo=new logOutPage(driver,pr);
		lo.SIgnOut();
		ScreenShotCapture.takegScreenshot(driver, "C:\\Users\\User\\eclipse-workspace\\YTFramework\\ScreenShot\\send.png");

	}
		
	}
	
