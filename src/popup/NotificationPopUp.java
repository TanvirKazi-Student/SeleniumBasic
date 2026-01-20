package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NotificationPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		//We can only handle web application actions by using action class only
		//Notification pop up is browser action
		
//		act.keyDown(Keys.TAB).keyDown(Keys.TAB).keyDown(Keys.TAB).keyDown(Keys.ENTER).perform();

		
		//Robot class is used for handle the notification pop-up
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		r1.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(100);
		
		driver.quit();
		
		
		
	}
}
