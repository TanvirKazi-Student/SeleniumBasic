package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByGroupOfIndex {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
	

		driver.findElement(By.xpath("(//input[@type='text'] )[2]")).sendKeys("Rohan");
		Thread.sleep(2000);
		driver.close();
	}
}
