package assignment8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1) open browser
//2) maximize browser
//3) enter into DWS webSite
//4) navigate to RedBus webSite
//5) go back to demo webSite
//6) once again go to RedBus webSite
//7) refresh the page
//8) close the browser
public class FindByElementsNavigate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().to("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
	}
}
