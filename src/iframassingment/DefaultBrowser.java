package iframassingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DefaultBrowser {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//div[@title='Learn More']")).click();
		Actions act = new Actions(driver);
		WebElement frames = driver.findElement(By.xpath("//section[text()='Frames']"));
		act.scrollToElement(frames).perform();
		frames.click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		
		//default iframe
		
		WebElement defaultFrame = driver.findElement(By.cssSelector(".w-full.h-96"));
		driver.switchTo().frame(defaultFrame);
		
		driver.findElement(By.id("username")).sendKeys("Rutuja");
		driver.findElement(By.id("password")).sendKeys("Rutuja123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		driver.switchTo().defaultContent();
		
		//Nested iframe
		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		
		Thread.sleep(2000);
		
		WebElement nestedFrame = driver.findElement(By.cssSelector(".w-full.h-96"));
		driver.switchTo().frame(nestedFrame);
		
		Thread.sleep(2000);
		
		WebElement innerFrame = driver.findElement(By.xpath("//section[@class='main_form_container']/div[2]/iframe"));
		driver.switchTo().frame(innerFrame);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Admin@1234");
		driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		driver.findElement(By.id("submitButton")).click();
		
		driver.switchTo().defaultContent();
		
		//Multiple iframe
		driver.findElement(By.xpath("//a[text()='Multiple iframe']")).click();
		Thread.sleep(3000);
		
		WebElement signUpFrame = driver.findElement(By.xpath("//div[@class='w-1/2']/iframe[1]"));
		driver.switchTo().frame(signUpFrame);
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Admin@1234");
		driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		driver.findElement(By.id("submitButton")).click();
		
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		
		WebElement loginFrame = driver.findElement(By.xpath("(//div[@class='w-1/2'])[2]/iframe"));
		driver.switchTo().frame(loginFrame);
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("Rutuja");
		driver.findElement(By.id("password")).sendKeys("Rutuja123");
		driver.findElement(By.id("submitButton")).click();
		
		driver.switchTo().defaultContent();
		
		//Nested with multiple iframe
		driver.findElement(By.xpath("//a[text()='Nested with Multiple iframe']")).click();
		Thread.sleep(2000);
		
		WebElement mainFrame = driver.findElement(By.xpath("//div[@class='px-8 pt-8 rounded-xl ']/iframe"));
		driver.switchTo().frame(mainFrame);
		Thread.sleep(2000);
		
		WebElement subFrame = driver.findElement(By.xpath("//div[@class='form_container']/iframe"));
		driver.switchTo().frame(subFrame);
		Thread.sleep(2000);
		
		WebElement emailFrame = driver.findElement(By.xpath("(//div[@class='form-group'])[1]/iframe"));
		driver.switchTo().frame(emailFrame);
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		driver.switchTo().parentFrame();
		
		WebElement passFrame = driver.findElement(By.xpath("(//div[@class='form-group'])[2]/iframe"));
		driver.switchTo().frame(passFrame);
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("Admin@1234");
		driver.switchTo().parentFrame();
		
		WebElement confirmPassFrame = driver.findElement(By.xpath("(//div[@class='form-group'])[3]/iframe"));
		driver.switchTo().frame(confirmPassFrame);
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirm")).sendKeys("Admin@1234");
		driver.switchTo().parentFrame();
		
		
		WebElement submitFrame = driver.findElement(By.xpath("(//div[@class='form-group'])[4]/iframe"));
		driver.switchTo().frame(submitFrame);
		Thread.sleep(2000);
		
		driver.findElement(By.id("submitButton")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
//		//windowb Alert iframe
//		driver.findElement(By.xpath("//a[text()='Window Alert Frame']")).click();
//		
//		WebElement alertMainFrame = driver.findElement(By.xpath("//div[@class='px-8 pt-8 rounded-xl']/iframe"));
//		driver.switchTo().frame(alertMainFrame);
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
//		
//		
		driver.quit();
		
	}

}




