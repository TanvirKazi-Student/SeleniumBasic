package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class P
{

	public static void main(String[] args) throws IOException, InterruptedException
	{

		        // Start Chrome
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();

		        // Open URL
		        driver.get("https://demowebshop.tricentis.com/");
		        Thread.sleep(3000);

		        String local = LocalDateTime.now().toString().replace(':', '-');
		        
		        // Take Screenshot
		        TakesScreenshot ts = (TakesScreenshot) driver;
		        File from = ts.getScreenshotAs(OutputType.FILE);

		        // IMPORTANT: give file name + extension
		        File to = new File("C:\\Users\\tanvi\\OneDrive\\Desktop\\demo screenshot\\"+ local+ "TANVIR.png");

		        FileHandler.copy(from, to);

		        // Close browser completely
		        driver.quit();
		 
	}
}
