package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Ebaybasecls 
{
	public WebDriver driver=null;
	
	String baseurl="https://www.ebay.com/";
	@Parameters("Browser")
	@BeforeTest
	public void setUp(String browserName)
	{
		System.out.println("Parameter value is "+browserName);
//		WebDriver driver=null;
		
		if(browserName.contains("Edge"))
		{
			WebDriver driver=new EdgeDriver();
		}
		else if(browserName.contains("Chrome"))
		{
			WebDriver driver=new ChromeDriver();
		}
		
		EdgeOptions option=new EdgeOptions();
		option.addArguments("--disable-notifications");
		driver=new EdgeDriver(option);
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
}
