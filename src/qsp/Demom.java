package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demom
{
	static
{
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
}
 

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        fbloginpage fb = new fbloginpage(driver);
        fb.enterUserName("aishuangadi28@gmail.com");
        fb.password("3br14ec008");
        fb.clickOnLogin();
        
        

	}

}
