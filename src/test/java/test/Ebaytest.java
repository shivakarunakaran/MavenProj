package test;

import org.testng.annotations.Test;
import basepkg.Ebaybasecls;
import page.Ebaypage;

public class Ebaytest extends Ebaybasecls
{	
	@Test
	public void Ebay()
	{			
		Ebaypage ebay=new Ebaypage(driver);
		ebay.selectoption("islarose@gmail.com");
		ebay.clickoptions("cricket bat");
		ebay.selvalues("iphone");
	}
}
