package locator;

import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndependentAndDependent {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https//demowebshop.tricentis.com/");
		
		driver.close();
	}
}
