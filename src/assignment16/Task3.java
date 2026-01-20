package assignment16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import assignment3.Login;
import utilityclass.BaseClass;

public class Task3 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		preCondition();
		logine();

		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();

		List<WebElement> books = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for (WebElement web : books) {
			web.click();
			Thread.sleep(1000);
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();

		List<WebElement> prices = driver.findElements(By.xpath("//td[@class='unit-price nobr']"));
		int index = -1;
		double max = Integer.MIN_VALUE;
		for (WebElement web : prices) {
			double price = Double.parseDouble(web.getText());
			System.out.println(price);
			if (price > max) {
				max = price;
				index++;
			}
		}

		List<WebElement> chekbox = driver.findElements(By.xpath("//input[@name='removefromcart']"));
		chekbox.get(index).click();
		WebElement update = driver.findElement(By.xpath("//input[@name='updatecart']"));
		update.click();
		logOut();
		driver.quit();
	}
}
