package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class P {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

//		String local=	String.valueOf(System.currentTimeMillis());
		DateTimeFormatter local = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File to = ts.getScreenshotAs(OutputType.FILE);
//		File from = new File("C:\\Users\\tanvi\\OneDrive\\Desktop\\demoscreenshot\\demo\\tanvir.png");
		File from = new File("C:\\Users\\tanvi\\OneDrive\\Desktop\\demoscreenshot\\demo\\" + local + ".png");
		FileHandler.copy(to, from);
		driver.close();
	}
}
