package assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarifyByUrl {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Thread.sleep(2000);
		String expectedResult = "https://demowebshop.tricentis.com/";

		driver.get(expectedResult);
		String actualResult = driver.getCurrentUrl();

		if (expectedResult.equals(actualResult)) {
			System.out.println("I am in the target web page");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@id='giftcard_2_RecipientName']")).sendKeys("Rohan");
			driver.findElement(By.xpath("//input[@id='giftcard_2_RecipientEmail']")).sendKeys("rohan@gmail.com");
			driver.findElement(By.xpath("//input[@id='giftcard_2_SenderName']")).sendKeys("Sarthak");
			driver.findElement(By.xpath("//input[@id='giftcard_2_SenderEmail']")).sendKeys("sarthak@gmail.com");
			driver.findElement(By.xpath("//textarea[@id='giftcard_2_Message']"))
					.sendKeys("This is Good Configration Laptop");
			WebElement quantity = driver.findElement(By.xpath("//input[contains(@class,'qty-input')]"));
			quantity.clear();
			quantity.sendKeys("2");
			driver.findElement(By.xpath("//input[@id = 'add-to-cart-button-2']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
			System.out.println("test case pass");
		} else {
			System.out.println("I am not in the target web page");
			driver.close();
			throw new Exception("test case faild");
		}

		driver.close();

	}
}
