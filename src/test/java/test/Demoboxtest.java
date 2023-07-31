//DemoCheckBoxTest

package test;

import org.testng.annotations.Test;

import basepkg.Demobasecls;
import page.Demoboxpage;

public class Demoboxtest extends Demobasecls
{
	
	@Test
	public void boxtest()
	{
		Demoboxpage boxobj=new Demoboxpage(driver);
		boxobj.selebox();
	}
	
}
