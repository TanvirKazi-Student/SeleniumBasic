package popup;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiBrowserDemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		
         String twitterUrl = "https://x.com/nopCommerce";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	   Thread.sleep(1000);
	   
	   Actions act = new Actions(driver);
	   act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();
	   
	   List<WebElement> links = driver.findElements(By.xpath("//a[contains(@target,'_blank')]"));
	   
	   for (WebElement web : links) {
	      web.click();
	      Thread.sleep(1000);
	   }
	   
	    Set<String> childs = driver.getWindowHandles();
	    for (String str : childs) {
		driver.switchTo().window(str);
		Thread.sleep(1000);
		
		String actualUrl = driver.getCurrentUrl();
		
		if(twitterUrl.equals(actualUrl))
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Create account']")).click();
			Thread.sleep(3000);
		}
	  }
	   
	   driver.quit();
	}

}
