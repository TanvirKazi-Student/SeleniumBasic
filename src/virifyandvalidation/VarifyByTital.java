package virifyandvalidation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarifyByTital {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String expected_title = "Demo Web Shop";
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");

		String actual_title = driver.getTitle();

		if (expected_title.equals(actual_title)) {
			System.out.println("I am in the targeted webpage");//pass
			driver.findElement(By.xpath("//a[@class='ico-register']")).click();
			System.out.println("test case is Pass");
			
		} else {
			System.out.println("I am not in the targeted webpage");//faile
			driver.close();
			throw new Exception("test case is Pass"); 
		}

		Thread.sleep(2000);
		driver.close();
	}
}
