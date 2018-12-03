package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo7 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/MS%20PATIL/Documents/sampl.html");
		driver.findElement(By.id("fp")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.name("forgot")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.className("pass")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.linkText("forgot password???")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Inbox")).click();
		
		
	}

}
