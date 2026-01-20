package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SingleChildBrowserPopup {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);

		String dwsHandle = driver.getWindowHandle();
		System.out.println(dwsHandle);

//		Actions act = new Actions(driver);
//		act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Set<String> childsHandle = driver.getWindowHandles();
		System.out.println(childsHandle);

		for (String str : childsHandle) {
			driver.switchTo().window(str);
			Thread.sleep(1000);
		}

		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		Thread.sleep(3000);

		driver.quit();

	}

}
