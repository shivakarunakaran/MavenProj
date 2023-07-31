//DemoDropdownTest

package test;

import org.testng.annotations.Test;

import basepkg.Demobasecls;
import page.Demodroppage;

public class Demodroptest extends Demobasecls
{
	
	@Test
	public void drop()
	{
		Demodroppage objdrop=new Demodroppage(driver);
		objdrop.selectdrop();
	}
	
}
