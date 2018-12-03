package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Tomaximize the window	
		driver.manage().window().maximize();
		
		//To enter the url
		driver.get("https://www.naukri.com/");
		//To close all the webpages which are opened by selenium(parent and child webpages)
		driver.quit();

	}

}
