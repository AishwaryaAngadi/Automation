package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dob {

	public static void main(String[] args)  throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MS PATIL\\eclipse-workspace\\Automation\\drivers\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	    WebElement day = driver.findElement(By.id("day"));
	    Select sel = new Select(day);
	    Thread.sleep(1000);
	    
	   //To select the day 
	    sel.selectByIndex(1);
	    Thread.sleep(1000);
	    sel.selectByIndex(2);
	    Thread.sleep(1000);
	    sel.selectByIndex(3);
	    Thread.sleep(1000);
	    
	    //To select the month
	    WebElement month = driver.findElement(By.id("month"));
	    Select sel1 = new Select(month);
	    sel1.selectByIndex(2);
	    Thread.sleep(1000);
	    sel1.selectByValue("3");
	    Thread.sleep(1000);
	    sel1.selectByVisibleText("Dec");
	    Thread.sleep(1000);
	    
	    //To select the year
	    //WebElement a =driver.findElement(By.id("year"));
	    driver.close();
	    
	

	}

}
