package assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Rohan");
		
		driver.findElement(By.name("lastname")).sendKeys("Whag");
		
		driver.findElement(By.id("day")).sendKeys("3");
		
		driver.findElement(By.id("month")).sendKeys("nov");
		
		driver.findElement(By.id("year")).sendKeys("2003");
		
		driver.findElement(By.cssSelector("input[value=\"2\"]")).click();
		
		driver.findElement(By.name("reg_email__")).sendKeys("rohan@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("rohan@123");
	}
}
