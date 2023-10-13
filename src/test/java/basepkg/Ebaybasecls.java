package basepkg;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;

public class Ebaybasecls 
{
	public WebDriver driver=null;
	
	String baseurl="https://www.ebay.com/";
	
	@BeforeTest
	public void setUp()
	{	
		EdgeOptions option=new EdgeOptions();
		driver=new EdgeDriver(option);
		driver.manage().window().maximize();
		driver.get(baseurl);
		option.addArguments("--disable-notifications");
	}
}
	
//	@Parameters("Browser")
//	@BeforeTest
//	public void setUp(String browserName)
//	{
//		System.out.println("Parameter value is "+browserName);
//		
//		if(browserName.contains("Edge"))
//		{
//			EdgeOptions option=new EdgeOptions();
//			driver=new EdgeDriver(option);
//			driver.manage().window().maximize();
//			driver.get(baseurl);
//			option.addArguments("--disable-notifications");
//		}
//		else if(browserName.contains("Chrome"))
//		{
//			WebDriver driver=new ChromeDriver();
//		}
//	}

//}