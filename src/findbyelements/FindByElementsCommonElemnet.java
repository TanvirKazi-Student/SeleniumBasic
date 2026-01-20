package findbyelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//finding with the common attribute
public class FindByElementsCommonElemnet {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		List<WebElement> poll = driver.findElements(By.xpath("//input[@name='pollanswers-1']"));

		for (WebElement web : poll) {
			web.click();
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		driver.close();
	}
}
