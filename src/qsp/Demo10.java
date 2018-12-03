package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 
	
	{
		static
		{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		}

		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://accounts.google.com/");
			driver.findElement(By.id("identifierId")).sendKeys("aishuangadi28@gmail.com");
			driver.findElement(By.xpath("//content[.='Next']")).click();
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lovemomdad");
			driver.findElement(By.xpath("//content[.='Next']")).click();
			Thread.sleep(1000);
			driver.close();
			

	}

}
