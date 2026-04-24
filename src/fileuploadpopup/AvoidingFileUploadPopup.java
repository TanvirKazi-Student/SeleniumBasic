package fileuploadpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AvoidingFileUploadPopup {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		Thread.sleep(1000);
		
		WebElement fileUpload = driver.findElement(By.xpath("//input[@type='file']"));
		fileUpload.sendKeys("C:\\Users\\tanvi\\Downloads/New Microsoft Word Document.docx");
		Thread.sleep(3000);
		
		driver.quit();
	}

}
