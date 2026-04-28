package robutclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysUsingRobot {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(1000);
		
		Robot bot = new Robot();
		
		bot.keyPress(KeyEvent.VK_R);
		bot.keyPress(KeyEvent.VK_U);
		bot.keyPress(KeyEvent.VK_T);
		bot.keyPress(KeyEvent.VK_U);
		bot.keyPress(KeyEvent.VK_J);
		bot.keyPress(KeyEvent.VK_A);
		
		bot.keyRelease(KeyEvent.VK_R);
		bot.keyRelease(KeyEvent.VK_U);
		bot.keyRelease(KeyEvent.VK_T);
		bot.keyRelease(KeyEvent.VK_U);
		bot.keyRelease(KeyEvent.VK_J);
		bot.keyRelease(KeyEvent.VK_A);
		
		driver.quit();
	}

}
