package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import screenshot.webElementScreenshop;

//Prompt Alert: Includes a text input field along with "OK" and "Cancel" buttons. 
//It is used when the application requires specific data from the user before continuing. 
public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");

		Actions act = new Actions(driver);
		
		WebElement alertwithTextBox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		act.moveToElement(alertwithTextBox).click().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Tanvir");
		alt.accept();
		Thread.sleep(2000);
		driver.close();

	}
}
