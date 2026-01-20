package task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//open the browser 
//maximize the Browser after maximizing enter into dws(demowebshop) web site
//after entering click on register
//after registering fill all the details from 
//click the register button
//close the Browser

public class Register {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

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
