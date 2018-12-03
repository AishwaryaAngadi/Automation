package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Qspsugg {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MS PATIL\\eclipse-workspace\\Automation\\drivers\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    driver.findElement(By.name("q")).sendKeys("qspiders");
	    Thread.sleep(1000);
	    
	    //To get address of all the suggestions
	    
	    List<WebElement> allsuggestion = driver.findElements(By.xpath("//span[contains(.,'qspiders')]"));
	    
	    //To get size of all suggestions
	    int count = allsuggestion.size();
	    System.out.println(count);
	    
	    //To print all suggestions
	    for(WebElement suggestion:allsuggestion)
	    {
	    	String text = suggestion.getText();
	    	System.out.println(text);
	    	
	    }
	    
	    //To click on last suggestion
	    WebElement s = allsuggestion.get(count-1);
	    s.click();
	    driver.close();
	    
	    

	}

}
