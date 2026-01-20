package assignment11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//Task first way first
public class Task1 {

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
		for (WebElement webElement : list) {// 0,1
			sel.selectByIndex(index++);// 0,1,2
			Thread.sleep(1500);
			if (index - 1 > 0) {// f,
				driver.navigate().back();
			}
			Thread.sleep(1500);
		}

//		for (; index < list.size(); index++) 
//		{
//			sel.selectByIndex(index);//0,1
//			Thread.sleep(1500);
//			if (index > 0) {
//				driver.navigate().back();
//				}
//			Thread.sleep(1500);
//		}

		System.out.println("outside the for loop");
		driver.quit();

	}
}
