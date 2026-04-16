package assingnment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a script for 5 ecommers website
public class StartUpScript1 {
	public static void main(String[] args) {
		// open the browser
		WebDriver ch1 = new ChromeDriver();
		// maximize the browser
		ch1.manage().window().maximize();
		// Enter into DemoWebShop
		ch1.get("https://github.com/TanvirKazi-Student");
		// close the browser
		ch1.close();
	}
}
