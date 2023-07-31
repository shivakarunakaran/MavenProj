//DemoTextTest

package test;

import org.testng.annotations.Test;
import basepkg.Demobasecls;
import page.Demotextpage;


public class Demotexttest extends Demobasecls
{
	
	@Test
	public void test()
	{
		Demotextpage ob=new Demotextpage(driver);
		ob.setvalues("Isla","9302854724","rose@gmail.com","islarose","Sydney");
		ob.submit();
	}
	
	
}
