package test;

import org.testng.annotations.Test;
import basepkg.Ebaybase;
import page.Ebaypage;

public class Ebaytest extends Ebaybase
{	
	@Test
	public void test1()
	{
		Ebaypage ebay=new Ebaypage(driver);
		ebay.selectoption();
		ebay.entervalue("islaro@gmail.com");
	}
}