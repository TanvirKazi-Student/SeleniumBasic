package assignment11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Task first way second
//Write a script for DWS webSite
//1)open the browser
//2)enter into DWS page
//3)click digital download
//4)select all the option inside the sort by drop down top to bottom
//5)close the browser
public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Digital downloads")).click();
		Thread.sleep(2000);
		WebElement singlSelect = driver.findElement(By.id("products-orderby"));
		Select sel = new Select(singlSelect);
		int size = sel.getOptions().size();
		for (int i = 0; i < size; i++) {
			WebElement singElement = driver.findElement(By.id("products-orderby"));
			sel = new Select(singElement);
			sel.selectByIndex(i++);
		}
		System.out.println("outside the for loop");
		driver.quit();
	}
}
