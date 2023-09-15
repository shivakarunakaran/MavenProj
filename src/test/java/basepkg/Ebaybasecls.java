package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class Ebaybasecls 
{
	public WebDriver driver;
	
	String url="https://www.ebay.com/";
	
	@BeforeTest
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
}