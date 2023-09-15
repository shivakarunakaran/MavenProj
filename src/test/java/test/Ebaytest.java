package test;

import org.testng.annotations.Test;
import basepkg.Ebaybasecls;
import page.Ebaypage;

public class Ebaytest extends Ebaybasecls
{	
	@Test
	public void test1()
	{
		Ebaypage ebay=new Ebaypage(driver);
		ebay.selectoption();
		ebay.entervalue("islaro@gmail.com");
	}
}