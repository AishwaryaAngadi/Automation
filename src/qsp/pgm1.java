package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm1 {

	public static void main(String[] args) throws InterruptedException 
	{   System.setProperty("webdriver.chrome.driver", "C:\\Users\\MS PATIL\\eclipse-workspace\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/MS%20PATIL/Documents/samp.html");
		WebElement submit=driver.findElement(By.id("s"));
		Thread.sleep(1000);
		
		//To click on submit button
		submit.submit();
		driver.navigate().back();
		Thread.sleep(1000);
		WebElement fname=driver.findElement(By.id("fn"));
		
		//To enter the text
		fname.sendKeys("Aishwarya");
		Thread.sleep(1000);
		
		//To clear the text field
		fname.clear();
		WebElement fb=driver.findElement(By.linkText("Facebook"));
		
		//To get Tagname of an element
		 String tag = fb.getTagName();
		 System.out.println("Tagname:"+tag);
		 
		 //To get Attribute value of an element
		 String value = fb.getAttribute("href");
		 System.out.println("Attribute value:"+value);
		 
		 //To get color of an element
		 String color=fb.getCssValue("color");
		 System.out.println("color:"+color);
		 
		 //To get font size of an element
		 String size=fb.getCssValue("font-size");
		 System.out.println("size:"+size);
		 
		 driver.close();
		 
	}

}
