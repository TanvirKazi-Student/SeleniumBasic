package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("https://www.flipkart.com/");
		WebElement surchfild = driver.findElement(By.className("Pke_EE"));
		surchfild.sendKeys("Puma");

		WebElement search = driver.findElement(By.tagName("svg"));
		search.click();

		Thread.sleep(2000);
		driver.close();
	}
}