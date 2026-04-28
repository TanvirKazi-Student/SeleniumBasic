package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait {
	

		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.shoppersstack.com/");
			
			//ExplictWait 
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("loginBtn")));
			
			driver.findElement(By.id("loginBtn")).click();
			
			
			wait.until(ExpectedConditions.elementToBeClickable(By.id("Create Account")));
			driver.findElement(By.id("Create Account")).click();
			
			
      	

	}

}
