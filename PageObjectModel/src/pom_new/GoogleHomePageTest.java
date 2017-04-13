package pom_new;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleHomePageTest {

	public static WebDriver driver = new FirefoxDriver();
	
	public static void main(String[] args) throws InterruptedException 
	{
		GoogleHomePageObjects page = new GoogleHomePageObjects(driver);
		driver.get("http://phptravels.com/demo/");
		
		page.ClickLogin();
		page.EnterDetails("user@phptravels.com","demouser");
		page.ClickLoginButton();
		driver.close();
	}

}
