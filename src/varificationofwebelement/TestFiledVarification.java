package varificationofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFiledVarification {

	public static void main(String[] args) throws Exception {
        String expectedResult = "hooddy";
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://demowebshop.tricentis.com/");
		WebElement surchfiled = driver.findElement(By.id("small-searchterms"));
		surchfiled.sendKeys(expectedResult);
		String actualResult = surchfiled.getAttribute("value");
		System.out.println("surchfiled data is:"+actualResult);
		Thread.sleep(2000);
		
		if (expectedResult.equals(actualResult)) {
			System.out.println("data is same and test case is pass");
		}else {
			driver.close();
			throw new Exception("\"data is not  same and test case is failes");
		}
		driver.close();
	}
}
