package assignment12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement uiClick = driver.findElement(By.xpath("//p[text()='UI Testing Concepts']"));
		act.moveToElement(uiClick).click(uiClick).perform();
		Thread.sleep(2000);


		Thread.sleep(2000);
		List<WebElement> navigateBar = driver
				.findElements(By.xpath("//li[@class='no-use relative hover:bg-orange-50']"));
		Thread.sleep(10000);
		for (WebElement webElement : navigateBar) {
			act.click(webElement).perform();
			Thread.sleep(2000);
		}

		Thread.sleep(2000);
		driver.close();
	}

}
