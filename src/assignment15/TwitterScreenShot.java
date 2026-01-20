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

public class TwitterScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		  WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://x.com/Cristiano");
	        driver.findElement(By.xpath("(//div[@class='css-175oi2r r-172uzmj r-1pi2tsx r-13qz1uu r-o7ynqc r-6416eg r-1ny4l3l'])[1]")).click();
	       
	        Thread.sleep(3000);
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File from = ts.getScreenshotAs(OutputType.FILE);
	        File to = new File("C:\\Users\\jangl\\OneDrive\\Desktop\\DemoScreenshot\\ronaldoprofile.jpg");
	        FileHandler.copy(from, to);
	        driver.quit();
	    
	}

}