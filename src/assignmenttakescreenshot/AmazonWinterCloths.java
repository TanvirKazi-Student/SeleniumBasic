package assignmenttakescreenshot;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Verify user is able to search products on Amazon
public class AmazonWinterCloths {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Winter cloths for men");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(6000);
		List<WebElement> products = driver.findElements(By.xpath("//h2//span"));
		for (WebElement product : products) {
			String name = product.getText().trim();
			if (!name.isEmpty()) {
				System.out.println(name + "   ");
			}
		}
		if (products.size() > 0) {
			System.out.println("PASS: Products are displayed");
		} else {
			System.out.println("FAIL: No products found");
		}
		driver.quit();
	}
}
