package crossbroweser;
import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class crossbrawoser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
        String browser = "CHROME";
        if(browser.equalsIgnoreCase("chrome")) {
        	driver = new  ChromeDriver();
        }else if(browser.equalsIgnoreCase("edge")){
        	driver = new  EdgeDriver();
        }else if(browser.equalsIgnoreCase("firefox")) {
        	driver = new  FirefoxDriver();
        }else {
        	driver = new  ChromeDriver();
        }
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.quit();	
	}
}
