package assignment14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//2) Write a script for Guru99

//1) Open the browser
//2) Maximize the browser
//3) Enter into Guru99.com
//4) Perform right-click action
//5) Click on "Right Click Me" element
//6) Click all the elements one by one like Edit, Cut, Copy, Delete, Paste, Quit
//7) While clicking, popup will be displayed
//8) Once popup is displayed, fatch the text of popup
//9) Handle the popup
//10) Close the browser
public class Task2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);

		Actions act = new Actions(driver);
		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));

		for (int i = 1; i < 6; i++) {
			act.contextClick(rightClickMe).perform();
			WebElement contextMenuList = driver
					.findElement(By.xpath("(//ul[@class='context-menu-list context-menu-root']/li/span)[" + i + "]"));
			act.click(contextMenuList).perform();
			Alert alt = driver.switchTo().alert();
			String text = alt.getText();
			alt.accept();
			System.out.println(text);
		}
		Thread.sleep(2000);
		driver.close();
	}
}
