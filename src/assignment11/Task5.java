package assignment11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task5 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(2000);
		driver.findElement(By.linkText("Digital downloads")).click();
		Thread.sleep(2000);
		WebElement singlSelect = driver.findElement(By.xpath(" //select[@id='products-viewmode']"));
		Select sel = new Select(singlSelect);

		List<WebElement> list = sel.getOptions();

		int index = 0;
		for (WebElement webElement : list) {
		    singlSelect = driver.findElement(By.xpath(" //select[@id='products-viewmode']"));
			sel = new Select(singlSelect);
			sel.selectByIndex(index++);
		}
		System.out.println("outside the for loop");
		driver.quit();

	}
}
