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

public class DynamicName {

	public static void main(String[] args) throws InterruptedException, IOException {
		String local = LocalDateTime.now().toString().replace(':', '-');
		System.out.println(local);
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from  = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\tanvi\\OneDrive\\Desktop\\demo screenshot\\"+local+".png");
		FileHandler.copy(from, to);
		Thread.sleep(3000);
		
		
	}
}
