package actionsclass;

import java.awt.dnd.DropTarget;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithOutUsingWebElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(100);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(100);
		Actions act = new Actions(driver);
		
		Thread.sleep(5000);
		for (int i = 0; i < 7; i++) {
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(100);
			act.sendKeys("Good Morning WeakUp").perform();
		}
//		act.keyDown(Keys.TAB).perform();
//		Thread.sleep(100);
//		act.keyDown(Keys.TAB).perform();
//		Thread.sleep(100);
//		act.keyDown(Keys.TAB).perform();
//		Thread.sleep(100);                                             
//		act.keyDown(Keys.TAB).perform();
//		Thread.sleep(100);
//		act.keyDown(Keys.TAB).perform();
//		Thread.sleep(100);
//		act.keyDown(Keys.TAB).perform();
//		Thread.sleep(100);
		
		
		driver.close();
	}
}
