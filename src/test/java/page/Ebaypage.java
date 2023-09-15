package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ebaypage 
{
	WebDriver driver;

	By fashion=By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a");
	By cart=By.xpath("/html/body/div[3]/header/div/ul[2]/li[6]/div/a[1]");
	By sign=By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div/div[2]/div/div[3]/a[1]");
	By user=By.xpath("//*[@id=\"userid\"]");
	By con=By.xpath("//*[@id=\"signin-continue-btn\"]");
	
	public Ebaypage(WebDriver driver)
	{
		this.driver=driver;
	}	
	public void selectoption()
	{
		driver.findElement(fashion).click();
		driver.findElement(cart).click();
		driver.findElement(sign).click();
	}
	
	public void entervalue(String name)
	{
		driver.findElement(user).sendKeys(name);
		driver.findElement(con).click();
	}
}