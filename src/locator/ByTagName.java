package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//tagName
public class ByTagName {

	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement searchField = driver.findElement(By.tagName("input"));
		searchField.sendKeys("patis vadapaw");
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
