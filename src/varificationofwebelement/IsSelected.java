package varificationofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement excelent = driver.findElement(By.id("pollanswers-1"));
		Thread.sleep(2000);
		excelent.click();
		if (excelent.isSelected()) {
			System.out.println("WebElement is selected");
		}else {
			System.out.println("WebElement is not selected");
		}
		driver.close();
	}
}
