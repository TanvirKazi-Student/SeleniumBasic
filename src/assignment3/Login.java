package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//1. Open the browser
//2. Maximize the browser
//3. Enter into Demo Web Shop website
//4. Click on Login link
//5. after Login fill all the details  
//6. Click on Login button
//7. Close the browser
public class Login {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ico-login")).click();
		driver.findElement(By.cssSelector("#Email")).sendKeys("om0891518@gmail.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("OM@123");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
