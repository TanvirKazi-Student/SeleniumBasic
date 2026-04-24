package assignmentalertpopup;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		act.contextClick(rightClick);
		
		List<WebElement> ele = driver.findElements(By.xpath("//span[text()='Edit']//../../li"));
		
		for (WebElement web : ele) {
			act.click(web).perform();
			try {
                Alert alt = driver.switchTo().alert();
                Thread.sleep(1000);
                System.out.println(alt.getText());
                alt.accept();
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("No alert generated");
            }
			
			Thread.sleep(1000);
			act.contextClick(rightClick);
		}
		
		driver.close();
		
		
	}

}
