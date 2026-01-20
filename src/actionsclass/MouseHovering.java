package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {
//moveToElement mouse method
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		Actions act = new  Actions(driver);
		WebElement buty =   driver.findElement(By.xpath("//a[@data-group='beauty']"));
		 
		WebElement faceMoicher =  driver.findElement(By.xpath("//a[@data-reactid='681']"));
		Thread.sleep(2000);
		act.moveToElement(buty).click(faceMoicher).perform();
		Thread.sleep(2000);
		driver.close();
	}
}
