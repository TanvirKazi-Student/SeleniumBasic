package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Confirmation Alert: Provides both "OK" and "Cancel" options. It is typically used to ask for user permission before proceeding with a
//potentially damaging action, such as deleting a record.
public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("https://demo.automationtesting.in/Alerts.html");

		Actions act = new Actions(driver);
		WebElement AlertWithOkAndCancle = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		act.moveToElement(AlertWithOkAndCancle).click().perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
		Thread.sleep(2000);

		driver.close();
	}
}
