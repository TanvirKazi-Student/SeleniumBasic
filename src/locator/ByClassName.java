package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// className
public class ByClassName {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window();
		
		Thread.sleep(2000);
		
		driver.get("https://demowebshop.tricentis.com/"); 
//		WebElement register =  driver.findElement(By.tagName("a"));
//		register.click();
		
		WebElement register = driver.findElement(By.className("ico-register"));
		
		register.click();
		
		Thread.sleep(2000);
		
		driver.close();

	}
}
