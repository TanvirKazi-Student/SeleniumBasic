package assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCart {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"Add to cart\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("Rohan");
		
		driver.findElement(By.xpath("//input[@class='recipient-email']")).sendKeys("rohan@gmail.com");

	
		driver.findElement(By.xpath("//input[@class='sender-name']")).sendKeys("Sarthsk");
	
		driver.findElement(By.xpath("//input[@class='sender-email']")).sendKeys("sarthak@gmail.com");
	
		driver.findElement(By.xpath("//textarea[@class='message']")).sendKeys("this is the important for user");
		
		WebElement web = driver.findElement(By.xpath("//input[@class='qty-input']"));
		web.clear();
		web.sendKeys("2");
		
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		
		driver.findElement(By.className("cart-label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
		Thread.sleep(2000);
		driver.close();

	}
}
