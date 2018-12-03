package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxE 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MS PATIL\\eclipse-workspace\\Automation\\drivers\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/MS%20PATIL/Documents/cb.html");
	    
	     //To get the address of all checkbox
	    List<WebElement> allcb = driver.findElements(By.xpath("//input[@type='checkbox']"));
	    
	    //To count number of checkbox
	   int count = allcb.size();
	   System.out.println(count);
	   
	   //To select all the checkbox
	   for(int i=0; i<=count ;i++)
	   {
	   if(i%2!=0)
	   {
		WebElement cb = allcb.get(i);
	   cb.click();
	   }
	 
	   }
	   
	    Thread.sleep(1000);
	    driver.close();


	}

}
