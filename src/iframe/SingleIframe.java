package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleIframe {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Frames.html");
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("singleframe");
		WebElement frame = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hii");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
        driver.quit();
	}
}
