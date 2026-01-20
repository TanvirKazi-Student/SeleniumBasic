package assignment10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws Exception {

		String expectedResult = "Demo Web Shop";

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String actualResult = driver.getTitle();
		
		if (expectedResult.equals(actualResult)) {
			System.out.println("Test case is pass");
			Thread.sleep(2000);
			WebElement login = driver.findElement(By.linkText("Log in"));
			
			if (login.isEnabled()) {
				System.out.println("logine link is enable Test case is Pass");
				login.click();
			}
		} else {
			driver.close();
			throw new Exception("logine link not enable Test case is Failed");
		}
		Thread.sleep(2000);
		driver.close();
	}
}
