package actionsclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
//mouse method
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		Actions act = new Actions(driver);
		List<WebElement> allSorse = driver.findElements(By.xpath("//div[@class='col-xs-10 col-xs-offset-2']"));
		WebElement target = driver.findElement(By.id("droparea"));
		for (WebElement webElement : allSorse) {
			act.dragAndDrop(webElement, target).perform();
			Thread.sleep(3000);
		}
		driver.close();

	}
}
