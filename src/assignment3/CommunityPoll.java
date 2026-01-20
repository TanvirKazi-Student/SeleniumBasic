package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommunityPoll {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.cssSelector("#pollanswers-1")).click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector("#pollanswers-2")).click();
		
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("#pollanswers-3")).click();
		
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("#pollanswers-4")).click();

		Thread.sleep(2000);

	}
}
