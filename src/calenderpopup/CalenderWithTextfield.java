package calenderpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderWithTextfield {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		Thread.sleep(2000);
		WebElement date =driver.findElement(By.id("datepicker2"));
		date.sendKeys("12/12/2025");
		System.out.println(date.getAttribute("value"));
		Thread.sleep(2000);
		driver.close();
	}

}
