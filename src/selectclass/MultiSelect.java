package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/tanvi/Downloads/demo-1%20(1).html");

		WebElement multiSelect = driver.findElement(By.id("multiple_cars"));	
		Select mulSel = new Select(multiSelect);
		mulSel.selectByVisibleText("Audi");
		Thread.sleep(2000);
		mulSel.selectByValue("bmw");
		Thread.sleep(2000);
		mulSel.selectByIndex(3);
		Thread.sleep(2000);
		mulSel.deselectByIndex(3);
		Thread.sleep(2000);
		mulSel.deselectAll();
		Thread.sleep(2000);
		driver.close();
	}
}
