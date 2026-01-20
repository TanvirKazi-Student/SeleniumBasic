package assignment9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class Task {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		driver.findElement(By.linkText("Gift Cards")).click();

		Thread.sleep(4000);

		List<WebElement> addCart = driver.findElements(By.xpath("//input[contains(@value,'Add to cart')]"));

		for (int i = 0; i < 2 && i < addCart.size(); i++) {// 0//1
			WebElement web = addCart.get(i);
			web.click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("Rohan");

			driver.findElement(By.xpath("//input[@class='recipient-email']")).sendKeys("rohan@gmail.com");

			driver.findElement(By.xpath("//input[@class='sender-name']")).sendKeys("Sarthsk");

			driver.findElement(By.xpath("//input[@class='sender-email']")).sendKeys("sarthak@gmail.com");

			driver.findElement(By.xpath("//textarea[@class='message']")).sendKeys("this is the important for user");

			WebElement webs = driver.findElement(By.xpath("//input[@class='qty-input']"));
			webs.clear();
			webs.sendKeys("1");

			driver.findElement(By.xpath("//input[@value='Add to cart']")).click();

			driver.navigate().back();
			Thread.sleep(4000);

		}

		for (int i = 2; i < 4 && i < addCart.size(); i++) {// 0//1
			WebElement web = addCart.get(i);
			web.click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("Rohan");

			driver.findElement(By.xpath("//input[@class='sender-name']")).sendKeys("Sarthsk");

			driver.findElement(By.xpath("//textarea[@class='message']")).sendKeys("this is the important for user");

			WebElement webs = driver.findElement(By.xpath("//input[@class='qty-input']"));
			webs.clear();
			webs.sendKeys("1");

			driver.findElement(By.xpath("//input[@value='Add to cart']")).click();

			driver.navigate().back();
			Thread.sleep(4000);

		}
		Thread.sleep(4000);
		driver.findElement(By.linkText("//span[text()='Shopping cart']")).click();

		Thread.sleep(2000);
		driver.close();

	}
}
