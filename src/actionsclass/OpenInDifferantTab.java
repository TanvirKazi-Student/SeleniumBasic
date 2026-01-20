package actionsclass;

import java.awt.dnd.DropTarget;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenInDifferantTab {
//keyDown it is the keyboard method
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(100);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(100);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).perform();
		Thread.sleep(2000);
		WebElement books = driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
		act.click(books).perform();
         
		Thread.sleep(2000);
		driver.close();
	}
}
