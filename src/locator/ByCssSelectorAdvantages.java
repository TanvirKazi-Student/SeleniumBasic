package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssSelectorAdvantages {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window();
		Thread.sleep(2000);

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

//		driver.findElement(By.cssSelector(".poll-options>li>input")).click();

		driver.findElement(By.cssSelector(".poll-options>li:nth-child(1)>input")).click();

		Thread.sleep(2000);

		driver.close();
	}
}
