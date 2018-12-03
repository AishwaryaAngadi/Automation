package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri1
{
	static
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}


	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.naukri.com/");
       Set<String> allWH = driver.getWindowHandles();
       for(String wh:allWH)
       {
    	   driver.switchTo().window(wh);
    	  String title = driver.getTitle();
    	  
    	   if(title.equals("Fullerton") )
    	   {
    		   driver.close();
    	   }
       }
       

	}

}
