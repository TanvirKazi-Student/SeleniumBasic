package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//sendKeys is keyboard method
public class SendKeysInSerchFild {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Actions act = new Actions(driver);
		WebElement serchFiled = driver.findElement(By.id("small-searchterms"));
		Thread.sleep(2000);
		act.sendKeys(serchFiled, "Hii Tanvir").perform();
		Thread.sleep(2000);
		driver.close();
	}
}
