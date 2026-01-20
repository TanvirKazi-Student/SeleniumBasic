package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashCode {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Users/tanvi/Downloads/demo-1%20(1).html");

		Thread.sleep(2000);

		WebElement singleSelect = driver.findElement(By.id("standard_cars"));

		Select sel = new Select(singleSelect);

		WebElement web = sel.getFirstSelectedOption();
		Thread.sleep(2000);

		sel.selectByIndex(2);
		Thread.sleep(2000);

		Thread.sleep(2000);
		driver.close();
	}

}
