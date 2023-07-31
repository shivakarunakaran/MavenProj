//DemoTestPage

package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Demotextpage 
{
	
	WebDriver driver;
	
	By tname=By.id("name");
	By tmobile=By.id("phone");
	By temail=By.id("email");
	By tpass=By.id("password");
	By taddress=By.id("address");
	By tsubmit=By.name("submit");
	
	public Demotextpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String name,String phone,String email,String password,String address)
	{
		driver.findElement(tname).sendKeys(name);
		driver.findElement(tmobile).sendKeys(phone);
		driver.findElement(temail).sendKeys(email);
		driver.findElement(tpass).sendKeys(password);
		driver.findElement(taddress).sendKeys(address);
	}
	
	public void submit()
	{
		driver.findElement(tsubmit).click();
	}

}
