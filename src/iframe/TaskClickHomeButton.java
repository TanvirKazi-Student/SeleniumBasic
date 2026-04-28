package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskClickHomeButton {
public static void main(String[] args) throws InterruptedException {
	
	String expected_url = "https://demo.automationtesting.in/Index.html";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//3.By passing WebElement of frame as an argument
		WebElement frame = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rutuja");
		
		//String parent = driver.getWindowHandle();
		//driver.switchTo().window(parent);
		
		//iframe method to switching parent page
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		Thread.sleep(2000);
		
		String actual_url = driver.getCurrentUrl();
		
		if(expected_url.equals(actual_url))
		{
			System.out.println("You are in Home page and testcase is passed");
		}
		
		else
		{
			System.out.println("you are in not home page and test case is failed");
		}
	
		
		
		
		driver.quit();
	}


}
