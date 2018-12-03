package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fk {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MS PATIL\\eclipse-workspace\\Automation\\drivers\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    WebElement p = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	    p.click();
	    driver.findElement(By.name("q")).sendKeys("iphone");
	    Thread.sleep(1000);
	    
	    //To get adress of all the suggestions
	    List<WebElement> allsugg = driver.findElements(By.xpath("//div[@class='_2kpuIQ']"));
	    
	    //To get size os all suggestion
	    int count = allsugg.size();
	    System.out.println(count);
	    
	    //To print all suggestions
	    
	   for(WebElement sugg:allsugg)
	   {
	    String text = sugg.getText();
	    System.out.println(text);
	    
	   }
	    
	   //To click on last suggestion
	   
	   WebElement s = allsugg.get(count-1);
	   s.click();
	   driver.close();
	    

	}

}
