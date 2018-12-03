package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException
	
	{
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\MS PATIL\\eclipse-workspace\\Automation\\drivers\\chromedriver.exe";
		System.setProperty(key, value);
        ChromeDriver c=new ChromeDriver();
        Thread.sleep(3000);
        c.close();
	}

}
