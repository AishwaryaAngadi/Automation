package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class link {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MS PATIL\\eclipse-workspace\\Automation\\drivers\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/MS%20PATIL/Documents/links.html");
	    
	    //To get address of all links
	    List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	    
	    //To get number of the links
	   int count = alllinks.size();
	   System.out.println(count);
	   
	   //To print the links
	   for(int i=0;i<count;i++)
	   {
		   WebElement link = alllinks.get(i);
		   String text = link.getText();
		   System.out.println(text);

	   }
driver.close();

	}

}
