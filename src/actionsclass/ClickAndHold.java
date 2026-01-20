package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
//clickAndHold is mouse method ,same as a drag and drop
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.automationtesting.in/Static.html");
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement sorce = driver.findElement(By.id("angular"));
		WebElement target = driver.findElement(By.id("droparea"));
		act.clickAndHold(sorce).release(target).perform();
		Thread.sleep(2000);
		driver.close();
	}
}
