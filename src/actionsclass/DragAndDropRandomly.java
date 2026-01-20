package actionsclass;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropRandomly {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		Actions act = new Actions(driver);
		WebElement target = driver.findElement(By.id("droparea"));
		Random r = new Random();
		Thread.sleep(5000);
		for (int i = 0; i < 12; i++) {
			int num = r.nextInt(1, 4);
			WebElement source = driver.findElement(By.xpath("//div[@id='dragarea']/div[" + num + "]/img"));
			act.dragAndDrop(source, target).perform();
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		List<WebElement> Droparea = driver.findElements(By.xpath("//div[@class='col-xs-10 col-xs-offset-2']"));
		int s = 0, a = 0, sal = 0;
		for (WebElement web : Droparea) {
			if (web.getAttribute("id").equals("angular")) {
				s++;
			} else if (web.getAttribute("id").equals("mongo")) {
				a++;
			} else {
				sal++;
			}
		}
		System.out.println("s symbole" + s);
		System.out.println("auto symbole" + a);
		System.out.println("selenium symbole" + sal);
		Thread.sleep(2000);
		driver.close();
	}
}
