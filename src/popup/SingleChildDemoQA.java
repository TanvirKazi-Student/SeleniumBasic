package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleChildDemoQA {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(1000);
		
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(1000);
		
		Set<String> childsHandle = driver.getWindowHandles();
		System.out.println(childsHandle);
		
		for (String str : childsHandle) {
			driver.switchTo().window(str);
			Thread.sleep(1000);
		}
		
		String newTab = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(newTab);
		
		driver.quit();
		
}
		

}
