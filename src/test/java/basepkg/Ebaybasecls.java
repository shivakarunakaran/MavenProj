package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;

public class Ebaybasecls 
{
	public WebDriver driver;
	
	String baseurl="https://www.ebay.com/";
	
	@BeforeTest
	public void setUp()
	{
		EdgeOptions option=new EdgeOptions();
		option.addArguments("--disable-notifications");
		driver=new EdgeDriver(option);
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
}
