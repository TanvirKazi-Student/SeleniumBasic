package popup;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultipleChildBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		String homeAndKitchenUrl = "https://www.ajio.com/c/8312";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/shop/men");
		
	   Thread.sleep(1000);
	   
	   List<WebElement> products = driver.findElements(By.xpath("menu-item-seperator"));
	   Actions act = new Actions(driver);
	   for (WebElement web : products) {
		act.keyDown(Keys.CONTROL).click(web).perform();
		Thread.sleep(1000);
	   }
	   
	   Set<String> childs = driver.getWindowHandles();
	   for (String str : childs) {
		driver.switchTo().window(str);
		String actUrl = driver.getCurrentUrl();
		
		if(homeAndKitchenUrl.equals(actUrl))
		{
			WebElement sortByDropDown = driver.findElement(By.id("sortBy"));
			Select sel = new Select(sortByDropDown);
			List<WebElement> options = sel.getOptions();
			int i=0;
			
			for (WebElement web : options) {
				
				sel.selectByIndex(i++);
				Thread.sleep(1000);
			}
		}
		Thread.sleep(2000);
	}
	   
	driver.quit(); 
	   
	}

}
