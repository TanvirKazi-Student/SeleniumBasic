package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/ul/li[1]/a")).click();

		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div/div/input")).click();
		
		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div/div[2]/div[2]/input")).sendKeys("Om");
		
		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div/div[2]/div[3]/input")).sendKeys("Sonvane");
		
		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div/div[2]/div[4]/input")).sendKeys("OM@gmail.com");
		
		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div//form/div/div[2]/div[3]/div[2]/div/input")).sendKeys("OM@123");
		
		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div//form/div/div[2]/div[3]/div[2]/div[2]/input")).sendKeys("OM@123");
		
		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div//form/div/div[2]/div[4]/input")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
