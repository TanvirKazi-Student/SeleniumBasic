package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssSelector {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://demowebshop.tricentis.com/");
		
//		driver.findElement(By.id("small-searchterms")).sendKeys("sleeping pillow");
//		driver.findElement(By.cssSelector("input[value='Search']")).click();
		
		
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("blanket");
		driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
		
		
		Thread.sleep(2000);
		
		driver.close();
	}
}


