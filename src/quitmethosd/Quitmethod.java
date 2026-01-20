package quitmethosd;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quitmethod {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
// 		driver.close();
		driver.quit();

	}
}
