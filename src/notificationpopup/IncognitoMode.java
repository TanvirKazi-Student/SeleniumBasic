package notificationpopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoMode {
	public static void main(String[] args) {
		
		//1.Create Object of ChromeOptions
		 ChromeOptions options = new ChromeOptions();
		
		//2.add argument
		 options.addArguments("--incognito");
		 
		 //pass object reference of ChromeOptions into driver
		 WebDriver driver = new ChromeDriver(options);
		 
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
	}

}
