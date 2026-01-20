package assignment11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//Task first way second
public class Task2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(2000);
		driver.findElement(By.linkText("Digital downloads")).click();
		Thread.sleep(2000);
		WebElement singlSelect = driver.findElement(By.id("products-orderby"));
		Select sel = new Select(singlSelect);

		List<WebElement> list = sel.getOptions();

		int index = 0;
		for (WebElement webElement : list) {
			WebElement singElement = driver.findElement(By.id("products-orderby"));
			sel = new Select(singElement);
			sel.selectByIndex(index++);
		}
		System.out.println("outside the for loop");
		driver.quit();

	}
}
