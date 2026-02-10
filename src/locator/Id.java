package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

//id	
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.id("newsletter-subscribe-button")).click();
	
	Thread.sleep(2000);
	
	driver.close();
}
}
