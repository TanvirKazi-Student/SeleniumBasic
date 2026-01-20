package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//linkText
public class BylinkText {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement register =  driver.findElement(By.linkText("Community poll"));
		System.out.println("Text in Targeted Element is" +register.getText()); 
		Thread.sleep(2000);
		driver.close();
	}
}
