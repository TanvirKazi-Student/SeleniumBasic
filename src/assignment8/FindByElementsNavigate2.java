package assignment8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class FindByElementsNavigate2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		Thread.sleep(2000);
		List<WebElement> addcart = driver.findElements(By.xpath("//input[@value='Add to cart']"));

		for (WebElement web : addcart) {
			web.click();
			Thread.sleep(2000);
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(2000);

		List<WebElement> prises = driver.findElements(By.xpath("//span[contains(@class,'unit-price')]"));

		double max = Double.MIN_VALUE;
		int maxIndex = -1;// maxIndex not take 0 because they increases 1,2 and in list store element
							// 0,1,2

//		for (int i = 0; i < prises.size(); i++) {
//			double price = Double.parseDouble(prises.get(i).getText());
//             
//			if (max < price) {
//				max = price;
//				maxIndex = i;
//			}
//		}

		for (WebElement web : prises) {
			double price = Double.parseDouble(web.getText());
			if (price > max) {// 1>minval,10>1,3>10//false
				max = price;
				maxIndex++;// 1,2
			}
		}
		System.out.println(maxIndex);

		System.out.println("print max price: " + max);
		Thread.sleep(4000);
		List<WebElement> removeCheck = driver.findElements(By.xpath("//  input[@name='removefromcart']"));
		Thread.sleep(2000);
		removeCheck.get(maxIndex).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();

		driver.close();
		Thread.sleep(2000);
	}
}
