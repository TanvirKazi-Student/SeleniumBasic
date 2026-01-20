package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByName {
// name
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window();
		Thread.sleep(2000);

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		driver.findElement(By.name("q")).sendKeys("Pizza");

		Thread.sleep(2000);
		
		driver.close();

	}
}
