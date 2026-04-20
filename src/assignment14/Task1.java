package assignment14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//1) Write a script for Prompt Popup

//1) Open the browser
//2) Maximize the browser
//3) Enter into Demo Automation Testing page
//4) Click on alert with text box
//5) Click the button to demonstrate the prompt box
//6) Send your name into the alert box
//7) Press OK button
//8) Verify whether the data is successfully passed inside the alert box or not

public class Task1 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);

		Actions act = new Actions(driver);

		WebElement alertwithTextBox = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		act.moveToElement(alertwithTextBox).click().perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(2000);

		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Ram");
		alt.accept();

		WebElement res = driver.findElement(By.id("demo1"));
		String actualtext = res.getText();

		if (actualtext.contains("Tanvir")) {
			System.out.println("Data is Same Testcase Pass");
		} else {
			System.out.println("Data is not Same Testcase Failed");
		}
		driver.close();

	}
}
