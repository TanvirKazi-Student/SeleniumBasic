package assignment14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);

		Actions act = new Actions(driver);
		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));

		for (int i = 1; i < 6; i++) {
			act.contextClick(rightClickMe).perform();
			WebElement contextMenuList = driver
					.findElement(By.xpath("(//ul[@class='context-menu-list context-menu-root']/li/span)[" + i + "]"));
			act.click(contextMenuList).perform();
			Alert alt = driver.switchTo().alert();
			String text = alt.getText();
			alt.accept();
			System.out.println(text);
		}
		Thread.sleep(2000);
		driver.close();
	}
}
