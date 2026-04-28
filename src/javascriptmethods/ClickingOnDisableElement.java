package javascriptmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingOnDisableElement {
	public static void main(String[] args) throws InterruptedException {
		
		String oracleSignUpUrl="https://signon.oracle.com/signin";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement jdk = driver.findElement(By.linkText("jdk-17.0.17_linux-x64_bin.deb"));
		
		js.executeScript("arguments[0].scrollIntoView(false);", jdk);
		jdk.click();
		Thread.sleep(2000);
		
		WebElement disabled_element = driver.findElement(By.linkText("Download jdk-17.0.17_linux-x64_bin.deb"));
		js.executeScript("arguments[0].click();", disabled_element);
		Thread.sleep(2000);
		
		if(driver.getCurrentUrl().equals(oracleSignUpUrl))
		{
			System.out.println("I have successfully clicked on disabled elemet");
		}
		else
		{
			System.out.println("Clicking on disabled element is unsuccessfull");
		}
		
	driver.quit();
		
		
	}

}
