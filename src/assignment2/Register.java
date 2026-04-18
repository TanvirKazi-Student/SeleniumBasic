package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//1)Open the browser
//2)Maximize the browser and enter into Demo Web Shop website
//3)Click on Register
//4)Fill all the registration details
//5)Click on Register button
//6)Close the browser
public class Register {
public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector(".ico-register")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#gender-male")).click();
		driver.findElement(By.cssSelector("#FirstName")).sendKeys("Om ");
		driver.findElement(By.cssSelector("#LastName")).sendKeys("Sonvane");
		driver.findElement(By.cssSelector("#Email")).sendKeys("om0891518@gmail.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("OM@123");
		driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("OM@123");
		driver.findElement(By.cssSelector("#register-button")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
