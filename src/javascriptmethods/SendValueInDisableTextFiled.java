package javascriptmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendValueInDisableTextFiled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		Thread.sleep(2000);
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		WebElement disableElement = driver.findElement(By.id("datepicker1"));
		js.executeScript("arguments[0].value='12/12/2025';", disableElement);

	}
}
