package assignmentalertpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		Thread.sleep(1000);

		Alert alt = driver.switchTo().alert();
		alt.dismiss();
		Thread.sleep(1000);

		driver.close();
	}

}
