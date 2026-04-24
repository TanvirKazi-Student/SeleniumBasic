package calenderpopup;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderWithoutTextfield {
	public static void main(String[] args) throws InterruptedException {
		// fetching today's date
		LocalDate today = LocalDate.now();
		// Date Formatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String todaysDate = today.format(formatter);
		// Date after 120 days
		LocalDate plus = today.plusDays(120);
		String plusDate = plus.format(formatter);

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(2000);

		// Static script
		// So it will not work after several date
		driver.findElement(By.id("dvfarecal")).click();
		Thread.sleep(2000);

		// Static script
		// driver.findElement(By.id("trd_0_14/12/2025")).click();

		// dynamic date
		driver.findElement(By.xpath("//li[contains(@id,'" + todaysDate + "')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("divRtnCal")).click();
		Thread.sleep(2000);

		// To fetch the month in number
		int month = plus.getMonthValue();
		System.out.println(month);

		for (int i = 1; i < month; i++) {
			driver.findElement(By.id("img2Nex")).click();
		}
		Thread.sleep(2000);

		// Static script
		// driver.findElement(By.id("g/04/2026")).click();

		// Dynamic
		driver.findElement(By.xpath("//li[contains(@id,'" + plusDate + "')]")).click();
		Thread.sleep(2000);

		driver.close();

	}
}
