package findbyelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//finding by using travalsing from common parent to child
public class FindByElementsTravalsing {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		List<WebElement> link = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));

		for (WebElement web : link) {
			web.click();
			Thread.sleep(2000);
			driver.navigate().back();
		}
		Thread.sleep(2000);
		driver.close();
	}
}
