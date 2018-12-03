package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip
{
	static
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.cleartrip.com/");
        driver.findElement(By.id("DepartDate")).click();
        String xp = "//span[.='November']/../../..//a[.='27']";
        driver.findElement(By.xpath(xp)).click();
        
		
		

	}

}
