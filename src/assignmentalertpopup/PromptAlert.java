package assignmentalertpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		Thread.sleep(1000);
		
		Alert alt = driver.switchTo().alert();
		
		alt.sendKeys("Tanvir");
		Thread.sleep(1000);
		
		alt.accept();
		Thread.sleep(1000);
		
		driver.close();
	
	}

}
