package assignmenttakescreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
//Verify behavior when Login Popup is NOT displayed
public class FlipkartLogin {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("b3wTlE")).click();
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		TakesScreenshot sc = (TakesScreenshot) driver;
		File from = sc.getScreenshotAs(OutputType.FILE);
		File to = new File("T:\\SeleniumProject\\SeleniumBasics\\ScreenShot.png");
		FileHandler.copy(from, to);
		Thread.sleep(1000);
		driver.quit();
	}

}
