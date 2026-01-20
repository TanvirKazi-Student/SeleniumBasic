package actionsclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAll {
//moveToElement mouse method
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");
		Actions act = new Actions(driver);
		List<WebElement> men = driver.findElements(By.xpath("//div[@class='desktop-navContent']"));
		for (WebElement webElement : men) {
			act.moveToElement(webElement).perform();
			 Thread.sleep(2000);
		}
		driver.close();
	}
}
