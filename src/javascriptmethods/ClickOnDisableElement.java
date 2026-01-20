package javascriptmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnDisableElement {
	public static void main(String[] args) throws InterruptedException {
		String oracaleSignUpPage = "https://signon.oracle.com/signin";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.oracle.com/in/java/technologies/downloads/#jdk25-linux");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement jdk = driver.findElement(By.linkText("jdk-17.0.17_linux-x64_bin.rpm"));
		js.executeScript("arguments[0].scrollIntoView(false);", jdk);
		jdk.click();
		WebElement disableElement = driver.findElement(By.linkText("Download jdk-17.0.17_linux-x64_bin.rpm"));
		js.executeScript("arguments[0].click();", disableElement);
		Thread.sleep(2000);
		
		
		if(driver.getCurrentUrl().equals(oracaleSignUpPage)) {
			System.out.println("I have Succesfully click the disable element");
		}else {
			System.out.println("I have not click the disable element");
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
