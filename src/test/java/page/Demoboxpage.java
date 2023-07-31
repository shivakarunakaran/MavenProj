//DemoCheckBoxPage

package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Demoboxpage 
{
	
	WebDriver driver;
	
	By expe=By.xpath("/html/body/div/div[5]/div[2]/div[1]/div[2]/label");
	By seleni=By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[1]/label");
	By testn=By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[3]/label");
	By mab=By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[5]/label");
	
	public Demoboxpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void selebox()
	{
		driver.findElement(expe).click();
		driver.findElement(seleni).click();
		driver.findElement(testn).click();
		driver.findElement(mab).click();
	}
	
}
