package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ebaypage 
{
	WebDriver driver;
	
	By fashion=By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a");
	By mens=By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[1]/div[2]");
	By shirt=By.xpath("//*[@id=\"s0-28-9-0-1[0]-0-1[0]-0-4-list\"]/li[1]/a/div/img");
	By seleshirt=By.xpath("//*[@id=\"s0-28-9-0-1[1]-0-0-4-list\"]/li[1]/a/div[1]/div/img");
	By adcard=By.xpath("//*[@id=\"mainContent\"]/div[2]/div/div[1]/div[2]/ul/li[2]/div/a");
	By cart=By.xpath("//*[@id=\"gh-minicart-hover\"]/div/a[1]");
	By sign=By.xpath("//*[@id=\"gh-ug\"]/a");
	By user=By.xpath("//*[@id=\"userid\"]");
	By con=By.xpath("//*[@id=\"signin-continue-btn\"]");
	
	public Ebaypage(WebDriver driver)
	{
		this.driver=driver;
	}	
	public void selectoption()
	{
		driver.findElement(fashion).click();
		driver.findElement(mens).click();
		driver.findElement(shirt).click();
		driver.findElement(seleshirt).click();
		driver.findElement(adcard).click();
		driver.findElement(cart).click();
		driver.findElement(sign).click();
	}
	
	public void entervalue(String name)
	{
		driver.findElement(user).sendKeys(name);
		driver.findElement(con).click();
	}
}