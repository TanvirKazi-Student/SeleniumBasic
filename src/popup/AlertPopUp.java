package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);

		Actions act = new Actions(driver);
		WebElement alertwithOk = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		act.moveToElement(alertwithOk).click().perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		alert.dismiss();
		Thread.sleep(2000);

		WebElement alertwithTextBox = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		act.moveToElement(alertwithTextBox).click().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		alert.sendKeys("Tanvir");
		alert.accept();
		Thread.sleep(2000);

		driver.close();
	}
}
