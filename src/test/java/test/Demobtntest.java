//DemoButtonTest

package test;

import org.testng.annotations.Test;

import basepkg.Demobasecls;
import page.Demobtnpage;

public class Demobtntest extends Demobasecls
{
	
	@Test
	public void testing()
	{
		Demobtnpage obj=new Demobtnpage(driver);
		obj.select();
	}
	
}
