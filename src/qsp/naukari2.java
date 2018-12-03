package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukari2
{static
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}


	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.naukri.com/");
        String pWH = driver.getWindowHandle();
        Set<String> allWH = driver.getWindowHandles();
        allWH.remove(pWH);
        for(String wh:allWH)
        {
        	driver.switchTo().window(wh);
        	driver.close();
        	Thread.sleep(1000);
        }
        driver.switchTo().window(pWH);
        Thread.sleep(1000);
        

	}

}
