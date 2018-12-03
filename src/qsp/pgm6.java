package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pgm6 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick_demo.php");
		WebElement box = driver.findElement(By.id("box"));
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		act.doubleClick(box).perform();
		driver.close();
		
		
		
		

	}

}
