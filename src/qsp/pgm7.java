package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm7 {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/MS%20PATIL/Documents/page1.html");
		driver.findElement(By.id("fn")).sendKeys("shiva");
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.id("mn")).sendKeys("raj");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("ln")).sendKeys("kumar");
		Thread.sleep(1000);
		driver.close();
		
		

	}

}
