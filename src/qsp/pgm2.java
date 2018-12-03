package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pgm2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MS PATIL\\eclipse-workspace\\Automation\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://webtime.mercuriusit.com/login.do");
		WebElement un = driver.findElement(By.name("username"));
		
		//To get the size of the element
		Dimension s =un.getSize();
		int h = s.getHeight();
		int w = s.getWidth();
		System.out.println("height:"+h);
		System.out.println("weight:"+w);
		System.out.println("==================================");
		
		//To get location of an element
		Point l = un.getLocation();
		int x = l.getX();
	    int y = l.getY();
	    System.out.println("x axis:"+x);
		System.out.println("y axis:"+y);
		System.out.println("==================================");
		
		//To check whether the element is present or not
		boolean v = un.isDisplayed();
		if(v)
		{
			System.out.println("element is present");	
		}
		else
		{
			System.out.println("element is not present");
		}
		System.out.println("==================================");
		
		//To check whether the element is selected or not
		WebElement cb = driver.findElement(By.id("keepLoggedInCheckBox"));
		cb.click();
		if(cb.isSelected())
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");	
		}
		driver.close();
		

	}
}
