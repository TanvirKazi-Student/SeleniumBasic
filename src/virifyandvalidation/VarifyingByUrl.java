package virifyandvalidation;

import java.lang.reflect.Executable;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarifyingByUrl {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

//		String expectedResult  =  "https://demowebshop.tricentis.com/worng";
		String expected_url = "https://demowebshop.tricentis.com/";
		Thread.sleep(2000);
		driver.get(expected_url);
//		driver.get("https://demowebshop.tricentis.com/");

		String actual_url = driver.getCurrentUrl();

		if (expected_url.equals(actual_url)) {
			System.out.println("I am in the targeted webpage");//pass
			driver.findElement(By.xpath("//a[@class='ico-register']")).click();
			System.out.println("test case is Pass");
			
		} else {
			System.out.println("I am not in the targeted webpage");//faile
			driver.close();
			throw new Exception("test case is Faile"); 
		}

		Thread.sleep(2000);
		driver.close();
	}
}
