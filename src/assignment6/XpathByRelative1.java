package assignment6;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//Write a script for DWS
//1)open the browser maximize the browser
//2)after enter into the DWS home page
//3)click digital downloads
//4)after feach all the digit downloads product and display in the console
//5)close the browser
//6)only use relative xpath
public class XpathByRelative1{
public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		String text = driver.findElement(By.xpath("//a[contains(text(),'3rd Album')]/../../div[3]/div/span")).getText();
		System.out.println("3rd Album place:"+text);
		String text1 = driver.findElement(By.xpath("//a[contains(text(),'Music 2')]/../../div[3]/div/span")).getText();
		System.out.println("Music 2:"+text1);
		String text2 = driver.findElement(By.xpath("(//a[contains(text(),'Music 2')])[2]/../../div[3]/div/span")).getText();
		System.out.println("Music 2:"+text2);
		Thread.sleep(2000);
		driver.close();
	}
}
