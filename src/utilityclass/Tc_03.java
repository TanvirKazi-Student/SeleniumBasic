package utilityclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tc_03 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		preCondition();
		Thread.sleep(2000);
		logine();

		driver.findElement(By.xpath("(//input[contains(@class,'button-2 product-box-add-to-cart-button')])[2]"))
				.click();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector(".cart-label")).click();
		driver.findElement(By.xpath("//input[contains(@name,'removefromcart')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'updatecart')]")).click();
		WebElement isEmpty =  driver.findElement(By.xpath("//div[contains(text(),'Your Shopping Cart is empty!')] "));
		if(isEmpty.isDisplayed()) 
		{
			System.out.println("Shopping cart is empty Testcase Pass");
		}
		else 
		{
			System.out.println("Shopping cart is not empty Testcase Pass");
		}
		logOut();
		postCondition();
	}
}
