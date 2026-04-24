package authenticationpopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticationPopup {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		Thread.sleep(1000);

		Robot bot = new Robot();
		bot.keyPress(KeyEvent.VK_A);
		bot.keyPress(KeyEvent.VK_D);
		bot.keyPress(KeyEvent.VK_M);
		bot.keyPress(KeyEvent.VK_I);
		bot.keyPress(KeyEvent.VK_N);
		Thread.sleep(1000);

		bot.keyRelease(KeyEvent.VK_A);

		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);

		bot.keyPress(KeyEvent.VK_A);
		bot.keyPress(KeyEvent.VK_D);
		bot.keyPress(KeyEvent.VK_M);
		bot.keyPress(KeyEvent.VK_I);
		bot.keyPress(KeyEvent.VK_N);
		Thread.sleep(1000);

		bot.keyRelease(KeyEvent.VK_A);

		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		driver.close();
	}

}
