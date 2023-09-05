//DemoTestBaseClass

package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class Demobasecls 
{
	
	public WebDriver driver;
	
	String baseurl="https://itera-qa.azurewebsites.net/home/automation";
	
	@BeforeTest
	public void setUp()
	{
		
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
	
	}
	
}
