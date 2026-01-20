package varificationofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	
	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		try {
			driver.findElement(By.className("ico-register"));
			System.out.println("element is found");
		} catch (Exception e) {
			driver.close();
			throw new Exception("not pass");
		}
		Thread.sleep(2000);
		driver.close();
	}
	
	
}
