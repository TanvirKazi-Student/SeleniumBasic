package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//ScrollUp and ScrollDown is mouse method
public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.automationtesting.in/Static.html");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement footer = driver.findElement(By.xpath("//a[@class='link facebook']"));
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		act.scrollToElement(footer).perform();
		Thread.sleep(2000);
		act.scrollToElement(home).perform();
		Thread.sleep(2000);
		driver.close();
	}
}
