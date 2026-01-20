package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsFunction {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//BYText
	driver.findElement(By.xpath("//a[contains(text(),'Books')]     ")).click();
		
        //ByAttribut
//		driver.findElement(By.xpath("//a[contains(@href,'books')]")).click();
//		Thread.sleep(2000);


	
		driver.close();
	}
}
