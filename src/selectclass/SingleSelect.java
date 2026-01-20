package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Users/tanvi/Downloads/demo-1%20(1).html");

		Thread.sleep(2000);

		WebElement singleSelect = driver.findElement(By.id("standard_cars"));

		Select sel = new Select(singleSelect);

		sel.selectByVisibleText("BMW");
		Thread.sleep(2000);
		sel.selectByValue("hda");
		Thread.sleep(2000);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		if (sel.isMultiple()) {
			System.out.println("Given DropDown menu is the multi select");
			sel.deselectByIndex(3);
		}	else {
			System.out.println("Given DropDown menu  is the single select");
		}
		Thread.sleep(2000);
		driver.close();
	}
}
