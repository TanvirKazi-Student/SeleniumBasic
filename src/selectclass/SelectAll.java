package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAll {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Users/tanvi/Downloads/demo-1%20(1).html");

		Thread.sleep(2000);

		WebElement singleSelect = driver.findElement(By.id("standard_cars"));

		Select sel = new Select(singleSelect);
		List<WebElement> allElement = sel.getOptions();

		int index = 0;

		for (WebElement webElement : allElement) {
			sel.selectByIndex(index++);
			Thread.sleep(1500);
		}
		
//		for (int i = 0; i < allElement.size(); i++) {
//			sel.selectByIndex(index++);
//			Thread.sleep(1500);
//		}
		driver.close();
	}
}
