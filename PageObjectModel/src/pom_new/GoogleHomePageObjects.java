package pom_new;


import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageObjects 
{
	public WebDriver driver;

	public GoogleHomePageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(linkText = "Login")
	public WebElement Loginsearch;
		
	@FindBy(id = "inputEmail")
	public WebElement username;
	
	@FindBy(id = "inputPassword")
	public WebElement password;
	
	@FindBy(id = "login")
	public WebElement LoginButton;
	
	public void ClickLogin() throws InterruptedException
	{
		Loginsearch.click();
		Thread.sleep(7000);
		ArrayList <String> URLs = new ArrayList <String>(driver.getWindowHandles());
		driver.switchTo().window(URLs.get(1));
	}
	
	public void EnterDetails(String Username, String Password)
	{
		username.sendKeys(Username);
		password.sendKeys(Password);
		
	}
	public void ClickLoginButton()
	{
		LoginButton.click();
	}
	
	
	
}
