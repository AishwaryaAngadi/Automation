package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class redbrick {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MS PATIL\\eclipse-workspace\\Automation\\drivers\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://home.redbrickhealth.com/");
	    WebElement aboutus = driver.findElement(By.xpath("//a[.='RedBrick Health']/../..//a[.='About Us']"));
	    Actions act = new Actions(driver);
	    act.moveToElement(aboutus).perform();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[.='Company']"));
	    driver.close();
	    

	}

}
