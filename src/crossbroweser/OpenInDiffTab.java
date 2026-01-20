package crossbroweser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilityclass.BaseClass;

public class OpenInDiffTab extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		preCondition();
		List<WebElement> drives = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
		Actions act = new Actions(driver);
		for (WebElement web : drives) {
			act.keyDown(Keys.CONTROL).click(web).perform();
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		postCondition();
	}
}
