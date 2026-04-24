package assignmenttakescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TwitterAccountScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
        String local = LocalDateTime.now().toString().replace(":", "-");
        String dynamicName = "bgImage_" + local;
        String frontProfile = "frontprofile"+local;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://x.com/ImRo45");

		// Click on profile image
		WebElement bgProfile = driver.findElement(By.xpath("(//img[@class='css-9pa8cd'])[1]"));
		bgProfile.click();

		Thread.sleep(3000);

		// Re-locate image after popup opens
		WebElement openedImage = driver.findElement(By.xpath("//main[@role='main']//img"));
		
		File from = openedImage.getScreenshotAs(OutputType.FILE);

		File to = new File("T:\\SeleniumProject\\SeleniumBasics\\ScreenShot" + dynamicName + ".png");

		FileHandler.copy(from, to);
        
        Thread.sleep(2000);
        
        driver.navigate().back();
        
        Thread.sleep(1000);
        
        WebElement frontProfileTwitter = driver.findElement(By.xpath("//div[contains(@class,'r-13qz1uu') and contains(@class,'r-o7ynqc')]"));
        Thread.sleep(3000);
        frontProfileTwitter.click();
        
		WebElement openedFrontProfile = driver.findElement(By.xpath("(//img[@class='css-9pa8cd'])[1]"));

		File from1 = openedFrontProfile.getScreenshotAs(OutputType.FILE);

		File to1 = new File("T:\\SeleniumProject\\SeleniumBasics\\ScreenShot" + frontProfile + ".png");

		FileHandler.copy(from1, to1);

		driver.quit();
	}
}
