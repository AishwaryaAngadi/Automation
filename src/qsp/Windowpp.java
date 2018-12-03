package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowpp

{
	static
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.seleniumhq.org/download/");
        driver.findElement(By.xpath("//a[.='3.141.59']")).click();
         Robot r = new Robot();
         r.keyPress(KeyEvent.VK_LEFT);
         r.keyRelease(KeyEvent.VK_LEFT);
         Thread.sleep(1000);
         r.keyPress(KeyEvent.VK_ENTER);
         r.keyRelease(KeyEvent.VK_ENTER);
         //driver.close();
         
	}

}
