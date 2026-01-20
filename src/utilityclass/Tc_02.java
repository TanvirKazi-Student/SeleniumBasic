package utilityclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tc_02 extends BaseClass {

	public static void main(String[] args) throws Exception {
		preCondition();
		logine();
		Thread.sleep(5000);
		WebElement shoppingCart = driver.findElement(By.xpath("//span[@class='cart-label']"));
		
		if (shoppingCart.isEnabled()) {
			shoppingCart.click();
			System.out.println("shoppincart is enable Testcase is pass");
		} else {
			logOut();
			postCondition();
			System.out.println("shopping cart is not enable Testcase is failed");
		}
		logOut();
		postCondition();
	}
}
