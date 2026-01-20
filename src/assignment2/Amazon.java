package assignment2;

import java.io.Closeable;
import java.time.temporal.ChronoField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//findByEkement
public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("https://shoppersstack.com/");
		
		Thread.sleep(1000);
		
		WebElement surchfild = driver.findElement(By.name("men"));
		surchfild.click();

	
//		WebElement search = driver.findElement(By.id("[id=\"women\"]"));
//		search.click();
//		Thread.sleep(1000);
//		
//		WebElement se = driver.findElement(By.name("name=\"kids\""));
//		se.click();
		
		Thread.sleep(2000);
//		driver.close();
	}
}
