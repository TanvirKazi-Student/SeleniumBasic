package assingnment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpScript5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5501/HTML/index.html");
		driver.findElement(By.xpath("//a[text()='Students']")).click();
		driver.findElement(By.xpath("//section[@id='box']/article/button[@id='placed']")).click();
	}
}
