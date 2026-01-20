package varificationofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement poll = driver.findElement(By.linkText("Log in"));
		Thread.sleep(2000);
		if (poll.isEnabled()) {
			System.out.println("element is found testcase is passed");
		} else {
			driver.close();
			throw new Exception("not pass");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
