package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ebaypage 
{
	WebDriver driver;
	
	By fashion=By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a");
	By addtocard=By.xpath("//*[@id=\"gh-minicart-hover\"]/div/a[1]/svg/use");
	By signin=By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div/div[2]/div/div[3]/a[1]");
	By username=By.xpath("//*[@id=\"userid\"]");
	By conti=By.xpath("//*[@id=\"signin-continue-btn\"]");
	
	public Ebaypage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setValues(String name)
	{
		driver.findElement(username).sendKeys(name);
	}
	
	public void selectoption()
	{
		driver.findElement(fashion).click();
		driver.findElement(addtocard).click();
		driver.findElement(signin).click();
		driver.findElement(conti).click();
	}
}
