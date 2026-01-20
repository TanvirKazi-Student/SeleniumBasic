package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeWithInIframe {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		WebElement outerFrame = driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
		driver.switchTo().frame(outerFrame);
		WebElement innerframe = driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
		driver.switchTo().frame(innerframe);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hii");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		driver.quit();
	}
}
