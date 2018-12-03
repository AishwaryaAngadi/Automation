package qsp;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Takescreenshot
{


	static
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws IOException  
	{
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	//create reference of Takescreenshot
	 TakesScreenshot t=(TakesScreenshot)driver;
	 
	 //To take the screenshot
      File src= t.getScreenshotAs(OutputType.FILE);
      //To create Destination
File dest = new File("./screenshot.png");
	 
	 //To copy file from source to destination
	 FileUtils.copyFile(src, dest);
	 driver.close();
		}

}
