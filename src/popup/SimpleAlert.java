package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Simple Alert: Displays a basic informational message or warning
//with only an OK button for acknowledgement.
public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
		Thread.sleep(2000);

		Alert alt = driver.switchTo().alert();

		alt.accept();
		Thread.sleep(2000);
		driver.close();
	}
}
