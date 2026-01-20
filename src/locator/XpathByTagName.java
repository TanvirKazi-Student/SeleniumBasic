package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTagName{

	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input")).sendKeys("movies");
		Thread.sleep(4000);
	
		
		String str =  driver.findElement(By.xpath("(//strong)[5]")).getText();
	    System.out.println("Community poll:"+str);
		Thread.sleep(2000);
		
		
		driver.close();
	}
}
