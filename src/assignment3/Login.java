package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//open the browser 
//maximize the Browser after maximizing enter into dws(demowebshop) web site
//after entering click on register
//after registering fill all the details from 
//click the register button
//close the Browser

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
