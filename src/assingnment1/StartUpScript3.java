package assingnment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpScript3 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.close();
	}
}
