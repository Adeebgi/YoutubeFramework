package org.testing.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotCapture {
	
	
	public static void takegScreenshot(ChromeDriver driver, String filepath) throws IOException {
		//we call this method based on our requirement 
		File f=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(filepath));
		
		//you might need some depenedency check note August 5
	}

}
