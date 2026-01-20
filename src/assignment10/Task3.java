package assignment10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws Exception {

		String expectedResult = "https://demowebshop.tricentis.com/login";
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		String actualResult = driver.getCurrentUrl();
		if (expectedResult.equals(actualResult)) {
			System.out.println("Succesfully enteraing into login page Test case is Pass");
		} else {
			driver.close();
			throw new Exception("Succesfully not enteraing into login page Test case is Failed");
		}
		Thread.sleep(2000);
		driver.close();
	}
}
