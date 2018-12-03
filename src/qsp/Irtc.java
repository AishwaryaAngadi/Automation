package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irtc
{static
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	
	}

	public static void main(String[] args) throws InterruptedException
	{
        WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("");
		Alert a = driver.switchTo().alert();
		Thread.sleep(1000);
		
		//To get the text
		String text = a.getText();
		System.out.println(text);
		
		//To click on ok
		a.accept();
		

	}

}
