package pom_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GCRShopLoginpage 
{
	WebDriver driver;
	By username = By.name("username");
	By password = By.name("password");
	By login = By.className("ui-button-text");
	By pagetitle = By.tagName("title");
	
	public void GCRAdminLogin (WebDriver driver){
		this.driver = driver;
	}
	public void setusername(CharSequence[] Strusername){
		driver.findElement(username).sendKeys(Strusername);
	}
	public void setpassword(CharSequence[] Strpassword){
		driver.findElement(password).sendKeys(Strpassword);
	}
	public void clicklogin(){
		driver.findElement(login).click();
	}
	public String getpagetitle(){
		return driver.findElement(pagetitle).getText();
			
	}
	public void loginGCRshop(CharSequence[] Strusername,CharSequence[] Strpassword){
		
		this.setusername(Strusername);
		this.setpassword(Strpassword);
		this.clicklogin();
	}
	
}
