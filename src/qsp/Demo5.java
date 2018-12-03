package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Tomaximize the window	
				driver.manage().window().maximize();
		//To enter the url		
				driver.get("https://www.facebook.com/");
				Thread.sleep(1000);
		//To navigate to the googl		
				driver.navigate().to("https://www.google.com/");
				Thread.sleep(1000);
		//To navigate to the previous page		
				driver.navigate().back();
				Thread.sleep(1000);
		//To nvigate to the next page		
				driver.navigate().forward();
				Thread.sleep(1000);
	//To referesh the current page(parent webpage)		
				driver.navigate().refresh();

	}

}
