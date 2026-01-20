package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpScript {

	public static void main(String[] args) {
		// open the browser
		ChromeDriver ch1 = new ChromeDriver();

		// maximize the browser
		ch1.manage().window().maximize();

		// Enter into DemoWebShop
		ch1.get("https://github.com/TanvirKazi-Student");
		
		
		//close the browser
		ch1.close();
		
	}
}
