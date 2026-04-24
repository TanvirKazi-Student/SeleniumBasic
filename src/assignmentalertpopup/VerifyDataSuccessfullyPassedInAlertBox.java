package assignmentalertpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyDataSuccessfullyPassedInAlertBox {

	public static void main(String[] args) throws Exception {

		String exp_text = "Tanvir";

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		Thread.sleep(1000);

		Alert alt = driver.switchTo().alert();

		// Pass text inside alert
		alt.sendKeys(exp_text);
		alt.accept(); // Click OK

		Thread.sleep(1000);

		// Get the message displayed on page
		String act_text = driver.findElement(By.id("demo1")).getText();
		System.out.println("Displayed message: " + act_text);

		// Validation
		if (act_text.contains(exp_text)) {
			System.out.println("Data successfully passed inside alert box");
		} else {
			System.out.println("Data NOT passed correctly");
		}

		driver.close();
	}
}
