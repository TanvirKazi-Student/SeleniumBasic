package assignmenttakescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

//Verify Search Functionality for "Bike" on Amazon
public class SearchBike {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		Actions act = new Actions(driver);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bike");
		driver.findElement(By.id("nav-search-submit-button")).click();
		act.keyDown(Keys.PAGE_DOWN).perform();
		TakesScreenshot sc = (TakesScreenshot) driver;
		File from = sc.getScreenshotAs(OutputType.FILE);
		File to = new File("T:\\SeleniumProject\\SeleniumBasics\\ScreenShot.png");
		FileHandler.copy(from, to);
		Thread.sleep(1000);
		driver.quit();
	}
}
