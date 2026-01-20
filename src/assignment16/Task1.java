package assignment16;

import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilityclass.BaseClass;

public class Task1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		preCondition();
		logine();
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		Actions act = new Actions(driver);
		for (WebElement web : list) {
			act.keyDown(Keys.CONTROL).click(web).perform();
		}
		logOut();
		Thread.sleep(1000);
		postCondition();
	}
}
