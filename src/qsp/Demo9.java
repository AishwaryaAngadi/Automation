package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9
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
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("aishuangadi28@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("3br14ec008");
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		
		Thread.sleep(1000);
				
		driver.close();

	}

}
