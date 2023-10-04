package page;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

public class Ebaypage 
{
	WebDriver driver;

	//Fashion
	By fashion=By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a");
	By mens=By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[1]/div[2]");
	By shirt=By.xpath("//*[@id=\"s0-28-9-0-1[0]-0-1[0]-0-4-list\"]/li[1]/a/div/img");
	By seleshirt=By.xpath("//*[@id=\"s0-28-9-0-1[1]-0-0-4-list\"]/li[1]/a/div[1]/div/img");
	By addshirtcard=By.xpath("//*[@id=\"mainContent\"]/div[2]/div/div[1]/div[2]/ul/li[2]/div/a");
//	By cart=By.xpath("//*[@id=\"gh-minicart-hover\"]/div/a[1]");
	By signup=By.xpath("//*[@id=\"gh-ug\"]/a");
	By username=By.xpath("//*[@id=\"userid\"]");
	By contin=By.xpath("//*[@id=\"signin-continue-btn\"]");
	By clihome=By.xpath("//*[@id=\"gh-la\"]");
	
	//SearchCricketbat
	By search=By.xpath("//*[@id=\"gh-ac\"]");
	By searchclick=By.xpath("//*[@id=\"gh-btn\"]");
	By clicdrpdwn=By.xpath("//*[@id=\"srp-ipp-menu\"]/button");
	By seledrp240=By.xpath("//*[@id=\"s0-53-17-6-3-4[60]-23-2-3-content-menu\"]/li[2]/a");
//	By scrollto4pg=By.xpath("//*[@id=\"srp-river-results\"]/ul/li[241]/div[2]/span/span/nav/ol/li[4]");
	By selebat=By.xpath("//*[@id=\"item59e9259c32\"]/div/div[2]/a");
	By addbatcard=By.xpath("//*[@id=\"mainContent\"]/div[2]/div/div[1]/div[2]/ul/li[2]/div");
	By clensearch=By.xpath("//*[@id=\"gh-ac\"]");
	
	//SearchPhone
	By searphon=By.xpath("//*[@id=\"gh-ac\"]");
	By clisearch=By.xpath("//*[@id=\"gh-btn\"]");
	By selephon=By.xpath("//*[@id=\"item3488e9018f\"]/div/div[2]/a");
	By phoclor=By.xpath("//*[@id=\"x-msku__select-box-1000\"]");
	By phostor=By.xpath("//*[@id=\"x-msku__select-box-1001\"]");
	By addphoncard=By.xpath("//*[@id=\"mainContent\"]/div[2]/div/div[1]/div[2]/ul/li[2]/div/a");
	
	
	public Ebaypage(WebDriver driver)
	{
		this.driver=driver;
	}	
	public void selectoption(String name)
	{
		driver.findElement(fashion).click();
		driver.findElement(mens).click();
		driver.findElement(shirt).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement web= driver.findElement(seleshirt);
		js.executeScript("arguments[0].scrollIntoView();", web);
		web.click();
		driver.findElement(addshirtcard).click();
//		driver.findElement(cart).click();
		driver.findElement(signup).click();	
		driver.findElement(username).sendKeys(name);
		driver.findElement(contin).click();
		driver.findElement(clihome).click();
	}
	
	public void clickoptions(String sear)
	{
		driver.findElement(search).sendKeys(sear);
		driver.findElement(searchclick).click();
		JavascriptExecutor jsc=(JavascriptExecutor) driver;
		WebElement ele= driver.findElement(clicdrpdwn);
		jsc.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		driver.findElement(seledrp240).click();
//		JavascriptExecutor jas=(JavascriptExecutor) driver;
//		WebElement we=driver.findElement(scrollto4pg);
//		jas.executeScript("arguments[0].scrollIntoView();", we);
//		we.click();

		String parentwindow=driver.getWindowHandle();
		System.out.println("Parent Window Title : "+driver.getTitle());
		
		JavascriptExecutor jasc=(JavascriptExecutor)driver;
		WebElement webe=driver.findElement(selebat);
		jasc.executeScript("arguments[0].scrollIntoView()", webe);
		webe.click();
//		driver.findElement(addbatcard).click();
		
		Set<String> allwindowhandle=driver.getWindowHandles();
		for(String handle : allwindowhandle)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(addbatcard).click();
//				driver.close();
			}
			driver.switchTo().window(parentwindow);
			System.out.println("Return to Parent Window");
		}
		JavascriptExecutor jascr=(JavascriptExecutor)driver;
		WebElement webel=driver.findElement(clensearch);
		jascr.executeScript("arguments[0].scrollIntoView()", webel);
		webel.clear();
//		driver.findElement(clensearch).clear();
	}
	
	public void selvalues(String seaphon)
	{
		driver.findElement(searphon).sendKeys(seaphon);
		driver.findElement(clisearch).click();
		JavascriptExecutor jav=(JavascriptExecutor)driver;
		WebElement webele=driver.findElement(selephon);
		jav.executeScript("arguments[0].scrollIntoView()", webele);
		webele.click();
		driver.findElement(addphoncard).click();
	}
}