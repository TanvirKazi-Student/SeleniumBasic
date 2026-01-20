package assignment10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();

		driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys("om0891518@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'Password')]")).sendKeys("OM@123");
		driver.findElement(By.xpath("//input[contains(@class,'button-1 login-button')]")).click();

		WebElement logOut = driver.findElement(By.linkText("Log out"));

		if (logOut.isDisplayed()) {
			System.out.println("logine is success Test case is Pass");
		} else {
			System.out.println("logine is not  success Test case is Faile");
		}
 
		Thread.sleep(2000);
		driver.close();
	}
}
