package fileuploadpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NaukriAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();

		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");

		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Tanvir Innus kazi");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("tanvirkazi2786@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("tanvir@02");
		Thread.sleep(2000);
		driver.findElement(By.id("mobile")).sendKeys("8308293303");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		Thread.sleep(2000);
		WebElement fileupload = driver.findElement(By.xpath("//input[@id='resumeUpload']"));
		fileupload.sendKeys("C:\\Users\\tanvi\\Downloads/Tanvir_Resume.pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(@class,'resman-icon-check-box')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'submitbtn')]")).click();
		Thread.sleep(2000);

		driver.close();

	}

}