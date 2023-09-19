package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	By home=By.xpath("//*[@id=\"gh-la\"]");
	By search=By.xpath("//*[@id=\"gh-ac\"]");
	By searchclick=By.xpath("//*[@id=\"gh-btn\"]");
	By scrollto4=By.xpath("//*[@id=\"srp-river-results\"]/ul/li[61]/div[2]/span/span/nav/ol/li[4]/a");
	By clidropdwn=By.xpath("//*[@id=\"srp-ipp-menu\"]/button");
	By drop240=By.xpath("//*[@id=\"s0-53-17-6-3-4[60]-23-2-3-content-menu\"]/li[2]/a");
	By goto8pg=By.xpath("//*[@id=\"srp-river-results\"]/ul/li[241]/div[2]/span/span/nav/ol/li[8]/a");
	By clisearch=By.xpath("//*[@id=\"gh-f\"]/table/tbody/tr/td[3]");
	By selgrynic=By.xpath("//*[@id=\"item494daf2afd\"]/div/div[2]/a/div");
	By addgrynic=By.xpath("//*[@id=\"mainContent\"]/div[2]/div/div[1]/div[2]/ul/li[2]/div");
//	By dsc=By.xpath("//*[@id=\"item4dfacf91ff\"]/div/div[2]/a/div/span");
//	By dscadd=By.xpath("//*[@id=\"mainContent\"]/div[2]/div/div[1]/div[2]/ul/li[2]/div");
	By checkout=By.xpath("//*[@id=\"mainContent\"]/div/div[3]/div[2]/div/div[1]/button");
	By guest=By.xpath("//*[@id=\"gxo-btn\"]");
	
	public Ebaypage(WebDriver driver)
	{
		this.driver=driver;
	}	
	public void selectoption()
	{
		driver.findElement(fashion).click();
		driver.findElement(mens).click();
		driver.findElement(shirt).click();
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,20)","");
		driver.findElement(seleshirt).click();
		JavascriptExecutor jas=(JavascriptExecutor) driver;
		jas.executeScript("window.scrollBy(0,100)", "");
		driver.findElement(adcard).click();
		driver.findElement(cart).click();
		driver.findElement(sign).click();
	}
	
	public void entervalue(String name)
	{
		driver.findElement(user).sendKeys(name);
		driver.findElement(con).click();
		driver.findElement(home).click();
	}
	public void clickoptions(String sear)
	{
		driver.findElement(search).sendKeys(sear);
		driver.findElement(searchclick).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)", "");
		driver.findElement(scrollto4).click();
		driver.findElement(clidropdwn).click();
		driver.findElement(drop240).click();
		driver.findElement(goto8pg).click();
		driver.findElement(clisearch).click();
		driver.findElement(selgrynic).click();
		driver.findElement(addgrynic).click();
//		driver.findElement(dsc).click();
//		driver.findElement(dscadd).click();
		driver.findElement(checkout).click();
		driver.findElement(guest).click();
	}
}