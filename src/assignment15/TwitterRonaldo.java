package assignment15;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class TwitterRonaldo {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://x.com/Cristiano");
        driver.findElement(By.xpath("//img[@class='css-9pa8cd']")).click();
       
        Thread.sleep(3000);
        TakesScreenshot ts = (TakesScreenshot) driver;
        File from = ts.getScreenshotAs(OutputType.FILE);
        File to = new File("C:\\Users\\jangl\\OneDrive\\Desktop\\DemoScreenshot\\ronaldobackground.jpg");
        FileHandler.copy(from, to);
        driver.quit();
	}

}