//FB Login Through Data driven

package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class FbBasecls 
{
	
	public WebDriver driver;
	
	String baseurl="https://www.facebook.com";
	
	@BeforeTest
	public void setUp()
	{
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		
	}
	
}
