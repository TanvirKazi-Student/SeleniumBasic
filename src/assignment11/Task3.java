package assignment11;

import java.awt.SecondaryLoop;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3 {
	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys("om0891518@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'Password')]")).sendKeys("OM@123");
		driver.findElement(By.xpath("//input[contains(@class,'button-1 login-button')]")).click();
		Thread.sleep(1500);
		WebElement logout = driver.findElement(By.linkText("Log out"));

		if (logout.isDisplayed()) {
			System.out.println("login succesfully");

			driver.findElement(By.linkText("Apparel & Shoes")).click();
			Thread.sleep(2000);
			List<WebElement> addCaretMul = driver.findElements(By.xpath("//input[contains(@value,'Add to cart')]"));

			for (int i = 0; i < 1 && i < addCaretMul.size(); i++) {
				WebElement web = addCaretMul.get(i);
				web.click();
				Thread.sleep(4000);
				WebElement singleSelect = driver.findElement(By.id("product_attribute_5_7_1"));
				Select sel = new Select(singleSelect);
				sel.selectByIndex(0);
				driver.findElement(By.xpath("//input[contains(@class,'button-1 add-to-cart-button')]")).click();
				Thread.sleep(1500);
				driver.navigate().back();
				Thread.sleep(1500);
			}
			for (int i = 1; i < 2 && i < addCaretMul.size(); i++) {
				WebElement web = addCaretMul.get(i);
				web.click();
				Thread.sleep(4000);
				WebElement singleSelect = driver.findElement(By.id("product_attribute_28_7_10"));
				Select sel = new Select(singleSelect);
				sel.selectByIndex(0);
				driver.findElement(By.xpath("(//span[contains(@class,'color-container')])[3]")).click();
				driver.findElement(By.xpath("//input[contains(@class,'button-1 add-to-cart-button')]")).click();
				Thread.sleep(1500);
				driver.navigate().back();
				Thread.sleep(1500);
			}

			for (int i = 2; i < 4 && i < addCaretMul.size(); i++) {
				Thread.sleep(1500);
				WebElement web = addCaretMul.get(i);
				web.click();
				Thread.sleep(1500);
			}
			Thread.sleep(6000);
			driver.findElement(By.xpath("//span[@class='cart-label']")).click();

			List<WebElement> prises = driver.findElements(By.xpath("//span[contains(@class,'unit-price')]"));
			List<WebElement> removeCheck = driver.findElements(By.xpath("//input[@name='removefromcart']"));
			
			double max = Double.MIN_VALUE;
			int index = 0;
			for (WebElement webElement : prises) {
				double prise = Double.parseDouble(webElement.getText());
				if (prise > max) {
					max = prise;
					index++;//2
				}
			}
			removeCheck.get(index).click();
			
			int index2 = 0;//3
			for (int i = index; i < prises.size(); i++) {
				WebElement webele = prises.get(i);
				double prise = Double.parseDouble(webele.getText());
				if (prise == max) {
					index2 = i;
				}
			}
			removeCheck.get(index2).click();
			
			System.out.println("max price: " + max);
			System.out.println(index);
			System.out.println(index2);

			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='updatecart']")).click();

		} else {
			driver.close();
			throw new Exception("Not login succesfullyTest Case Failed");
		}
		Thread.sleep(2000);
		driver.close();

	}
}
