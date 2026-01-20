package assignment10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) throws Exception {
		String expectedemail = "om0891518@gmail.com";

		String expectedResult = "Demo Web Shop. Login";
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		String actualResult = driver.getTitle();
		if (expectedResult.equals(actualResult)) {
			System.out.println("Succesfully enteraing into login page Test case is Pass");
			WebElement searchfildemail = driver.findElement(By.xpath("//input[contains(@id,'Email')]"));
			searchfildemail.sendKeys(expectedemail);
			String actualemail = searchfildemail.getAttribute("value");

			if (expectedemail.equals(actualemail)) {
				System.out.println("email is correctly pass ");
			} else {
				System.out.println("email is not correctly pass ");
			}
		} else {
			driver.close();
			throw new Exception("Succesfully not enteraing into login page Test case is Failed");
		}
		Thread.sleep(2000);
		driver.close();
	}
}
