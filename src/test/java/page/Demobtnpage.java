//DemoButtonPage

package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Demobtnpage 
{
	
	WebDriver driver;
	
	By btnmale=By.id("male");
	By boxmon=By.id("monday");
	By boxwed=By.id("wednesday");
	By boxfri=By.id("friday");
	By boxsun=By.id("sunday");
	
	public Demobtnpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void select()
	{
		driver.findElement(btnmale).click();
		driver.findElement(boxmon).click();
		driver.findElement(boxwed).click();
		driver.findElement(boxfri).click();
		driver.findElement(boxsun).click();
	}
	
}
