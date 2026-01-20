package assignment17;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		WebElement frame = driver.findElement(By.xpath("//section[text()='iframes']"));
		Actions act = new Actions(driver);
		act.scrollToElement(frame).perform();
		Thread.sleep(2000);
		frame.click();
		driver.quit();
	}
}
