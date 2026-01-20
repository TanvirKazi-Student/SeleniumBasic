package actionsclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByKeyBord {
//PAGE_DOWN and PAGE_UP is the keyboard method
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		driver.close();
	}
}
