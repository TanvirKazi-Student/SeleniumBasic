package assignmenttakescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
//Verify Flipkart Homepage UI not Loads Successfully
public class FlipkartFashionSection {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("b3wTlE")).click();
		Actions act = new Actions(driver);
		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		act.moveToElement(fashion).perform();
		TakesScreenshot sc = (TakesScreenshot) driver;
		File from = sc.getScreenshotAs(OutputType.FILE);
		File to = new File("T:\\SeleniumProject\\SeleniumBasics\\ScreenShot.png");
		FileHandler.copy(from, to);
		Thread.sleep(1000);
		driver.quit();
	}

}
