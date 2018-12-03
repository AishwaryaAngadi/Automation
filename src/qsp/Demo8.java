package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException
	
	{
		//To automatically get usernam and psw
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/MS%20PATIL/Documents/sampl.html");
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Aishwarya");
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Aishu123");
	
	Thread.sleep(1000);
	driver.close();

	}

}
