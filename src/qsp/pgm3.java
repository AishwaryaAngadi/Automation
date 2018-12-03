package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pgm3 {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MS PATIL\\eclipse-workspace\\Automation\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement rb = driver.findElement(By.id("u_0_9"));

		
		
		if(rb.isSelected())
		{
			System.out.println("selected");

		}
		else
		{
			System.out.println("not selected");

		}
       
       driver.close();
	}

}
