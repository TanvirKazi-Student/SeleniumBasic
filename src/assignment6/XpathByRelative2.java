package assignment6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByRelative2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //a[text()='Build your own cheap computer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='product_attribute_72_5_18_65']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='product_attribute_72_6_19_91']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='product_attribute_72_3_20_58']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='product_attribute_72_8_30_94']")).click();
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//input[@id='addtocart_72_EnteredQuantity']"));
		text.clear();
		text.sendKeys("2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
