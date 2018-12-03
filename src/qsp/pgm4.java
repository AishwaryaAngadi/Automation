package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pgm4 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MS PATIL\\eclipse-workspace\\Automation\\drivers\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("http://webtime.mercuriusit.com/login.do");
	    driver.findElement(By.name("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.id("loginButton")).click();
	    
	    

	}

}
