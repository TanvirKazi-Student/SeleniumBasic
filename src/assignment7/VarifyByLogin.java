package assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarifyByLogin {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		String exceptedTital = "Demo Web Shop";
		driver.get("https://demowebshop.tricentis.com/");

		String actualTital = driver.getTitle();
		if (exceptedTital.equals(actualTital)) {
			System.out.println("i am in target in webpage");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("om0891518@gmail.com");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("OM@123");
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@id='product_attribute_72_5_18_52']")).click();
			driver.findElement(By.xpath("//input[@id='product_attribute_72_6_19_54']")).click();
			driver.findElement(By.xpath("//input[@id='product_attribute_72_3_20_57']")).click();
			driver.findElement(By.xpath("//input[@id='product_attribute_72_8_30_93']")).click();

			WebElement quntity = driver.findElement(By.xpath("//input[@id='addtocart_72_EnteredQuantity']"));
			quntity.clear();
			quntity.sendKeys("2");
			driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();

			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
			driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
			driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		} else {
			System.out.println("i am not in target in webpage");
			driver.close();
			throw new Exception("test case is faild");
		}
		Thread.sleep(2000);
		driver.close();
	}
}
