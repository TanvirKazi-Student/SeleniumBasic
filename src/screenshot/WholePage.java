package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WholePage {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//For dynamic file name
		String local = LocalDateTime.now().toString().replace(':', '-');
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//Downcast driver to TakesScreenshot
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		
		//For taking screenshot
		File from = screenshot.getScreenshotAs(OutputType.FILE);
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
		//set address to store the screenshot for every screenshot it will store in new file 
		File to = new File("C:\\selenium\\com.crm.seleniumA13\\src\\Screenshots\\dwsHome"+local+".png");
		
		//copy the screenshot 
		FileHandler.copy(from, to);
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									