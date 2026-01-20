package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
//doubleClick is mouse method
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement dubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(dubleClick).perform();
		driver.close();
	}
}
