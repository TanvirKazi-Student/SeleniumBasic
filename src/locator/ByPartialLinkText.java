package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//partialLinkText
public class ByPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Shopping")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
