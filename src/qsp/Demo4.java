package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException
	{//to open the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
	//Tomaximize the window	
		driver.manage().window().maximize();
	//Toenter the url	
		driver.get("https://www.google.com/");
		
		
		
	//To get the title of the current webpage	
		String title = driver.getTitle();
		System.out.println("Title: "+title);
	//To get the current url	
		String url = driver.getCurrentUrl();
		System.out.println("URL:"+url);
	//To close the window	
		Thread.sleep(1000);
		driver.close();
				
	}

}
