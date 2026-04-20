package assignment10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//write a script for DWS application
//1) open the browser
//2) maximize the browser
//3) enter into DWS home page
//4) verify the page using the title
//5) verify that the login link is display or not
//7) click the login link
//8) close the browser
public class Task1 {
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
			if (login.isDisplayed()) {
				System.out.println("login  link is desable Test case is Pass");
				login.click();
			}
		} else {
			driver.close();
			throw new Exception("logine  link not desable Test case is Failed");
		}
		Thread.sleep(2000);
		driver.close();
	}
}
