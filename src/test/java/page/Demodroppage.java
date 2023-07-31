//DemoDropdownPage

package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Demodroppage 
{
		
	WebDriver driver;
	
	By seldrop=By.xpath("/html/body/div/div[4]/div[2]/div/select");
	By selection=By.xpath("/html/body/div/div[4]/div[2]/div/select/option[5]");
	
	public Demodroppage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void selectdrop()
	{
		driver.findElement(seldrop).click();
		driver.findElement(selection).click();
	}
	
}
