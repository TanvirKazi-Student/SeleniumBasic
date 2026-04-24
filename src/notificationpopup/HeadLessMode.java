package notificationpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessMode {
	public static void main(String[] args) throws Exception {
		
		String registerUrl = "https://demowebshop.tricentis.com/register";
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(1000);
		
		String actualUrl = driver.getCurrentUrl();
		if(registerUrl.equals(actualUrl))
		{
			System.out.println("Successfully entered into register page and Testcsae is pass");
		}
		else
		{
			driver.close();
			throw new Exception("Enter into register page is unsuccessfull and test case is fail"); 
		}
		
		driver.quit();
		
	}

}
