package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class hotelmul {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MS PATIL\\eclipse-workspace\\Automation\\drivers\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("file:///C:/Users/MS%20PATIL/Documents/hotel.html");
	    WebElement hotel = driver.findElement(By.id("maarya"));
	    Select sel = new Select(hotel);
	    Thread.sleep(1000);
	    
	    //select by index
	    sel.selectByIndex(1);
	    Thread.sleep(1000);
	    
	    //select by value
	    sel.selectByValue("m");
	    Thread.sleep(1000);
	    
	    //select by visible value
	    sel.selectByVisibleText("fish");
	    Thread.sleep(1000);
	    
	    //deselect by index
	    sel.deselectByIndex(1);
	    Thread.sleep(1000);
	    
	    //deselect by value
	    sel.deselectByValue("p");
	    Thread.sleep(1000);
	    
	    //deselect by visible value
	    sel.deselectByVisibleText("fish");
	    Thread.sleep(1000);
	    
	 
driver.close();

	}

}
