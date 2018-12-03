package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		Thread.sleep(1000);
		driver.close();


	}

}
