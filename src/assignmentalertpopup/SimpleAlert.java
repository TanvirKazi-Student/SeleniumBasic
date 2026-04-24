package assignmentalertpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".btn.btn-danger")).click();
		Thread.sleep(1000);

		Alert alt = driver.switchTo().alert();
		alt.accept();

		driver.close();

	}

}
