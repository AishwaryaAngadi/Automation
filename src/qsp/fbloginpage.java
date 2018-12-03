package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbloginpage
	
	{
		//Declaratiomn
		@FindBy(id="email")
		private WebElement unTB;
		
		@FindBy(name="pass")
		private WebElement pwTB;
		
		@FindBy(xpath="(//input[@value='Log In'])")
		private WebElement LoginBTN;
		
		//Initialzation
		
		public fbloginpage(WebDriver diver)
		{
			WebDriver driver = null;
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		public void enterUserName(String un)
		{
			unTB.sendKeys(un);
		}
		public void password(String pw)
		{
			pwTB.sendKeys(pw);
		}
		public void clickOnLogin()
		{
			LoginBTN.click();
		
		}
		
	
	}


