package assignment16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilityclass.BaseClass;

public class Task2 extends BaseClass {

	public static void main(String[] args) throws Exception {
		preCondition();
		driver.findElement(By.xpath("//a[contains(text(),'Jewelry')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Your Own Jewelry']")).click();
		driver.findElement(By.xpath("//option[@value='47']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("50");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		WebElement quntity = driver.findElement(By.xpath("//input[@data-val='true']"));
		quntity.clear();
		quntity.sendKeys("2");
		driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		WebElement element = driver.findElement(By.xpath("//a[text()='Create Your Own Jewelry']"));
		if (element.isDisplayed()) {
			System.out.println("Element is displayed");
		}
		 else {
			driver.close();
			throw new Exception("Element not displayed");
		}
		Thread.sleep(2000);
		driver.close();
	}
}
