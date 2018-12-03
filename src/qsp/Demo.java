package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
FirefoxDriver f=new FirefoxDriver();
Thread.sleep(1000);
f.close();
	}

}
