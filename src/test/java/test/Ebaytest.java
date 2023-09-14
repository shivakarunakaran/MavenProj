package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import basepkg.Ebaybasecls;
import page.Ebaypage;

public class Ebaytest
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
	@Test
	public void test()
	{
		Ebaypage ebay=new Ebaypage(driver);
		ebay.setValues("isla rose");
		ebay.selectoption();
	}
}
