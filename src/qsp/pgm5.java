package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pgm5 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/MS%20PATIL/Documents/hotel.html");
		WebElement hotel = driver.findElement(By.id("maarya"));
		Select sel = new Select(hotel);
		
		boolean v = sel.isMultiple();
		if(v)
		{
		System.out.println("multiple select");
		}
		else
		{
			System.out.println("single select");	
		}
		
driver.close();
	}

}
