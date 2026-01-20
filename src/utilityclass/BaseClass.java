package utilityclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver = null;

	public static void preCondition() throws InterruptedException {
		String browser = "CHROME";
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}

	public static void logine() {
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("om0891518@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("OM@123");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
	}

	public static void logOut() {
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}

	public static void postCondition() {
		driver.quit();
	}

}
