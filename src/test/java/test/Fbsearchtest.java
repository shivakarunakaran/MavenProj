//Amazon Search

package test;

import org.testng.annotations.Test;

import basepkg.FbBasecls;
import page.Fbsearch;

public class Fbsearchtest extends FbBasecls
{
	
	@Test
	public void logintest()
	{
		Fbsearch obj=new Fbsearch(driver); 
		obj.setvalues("davy@gmailcom", "rose123");
		obj.login();
		
	}
	
}
