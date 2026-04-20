package assignment10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//1) open the browser
//2) maximize the browser
//3) enter into DWS webSite
//4) click the login link
//5) verify the page whether I am successfully enter into login page by using URL
//6) send the current credential to the password field
//7) check whether data is successfully added into password field or not
//8) close the browser
public class Task5 {
public static void main(String[] args) throws Exception {
		String expectedPass = "OM@123";
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
			WebElement serchfiledPass = driver.findElement(By.xpath("//input[contains(@id,'Password')]"));
			serchfiledPass.sendKeys(expectedPass);
			String actualPass = serchfiledPass.getAttribute("value");

			if (expectedPass.equals(actualPass)) {
				System.out.println("password is correctly pass ");
			} else {
				System.out.println("password is not correctly pass ");
			}
		} else {
			driver.close();
			throw new Exception("Succesfully not enteraing into login page Test case is Failed");
		}
		Thread.sleep(2000);
		driver.close();
	}
}
