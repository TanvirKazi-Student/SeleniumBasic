package synchronization;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OmayaBlogSpot {
	public static void main(String[] args) {
		
		
        WebDriver driver = new ChromeDriver();

        
        driver.manage().window().maximize();

       
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

       
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        
        driver.get("https://omayo.blogspot.com/");

        String parentWindow = driver.getWindowHandle();

       
        Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        // Click dropdown in footer
        wait.until(ExpectedConditions.elementToBeClickable(By.className("dropbtn"))).click();

        // 5. Click Facebook (open in new window)
        WebElement facebook = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Facebook']")));

        act.keyDown(Keys.CONTROL).click(facebook).keyUp(Keys.CONTROL).perform();

        // Switch to Facebook window
        Set<String> childs = driver.getWindowHandles();
        for (String str : childs) {
            if (!str.equals(parentWindow)) {
                driver.switchTo().window(str);
                break;
            }
        }

        // 6. Click Create New Account
        WebElement createAccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Create new account']")));
        createAccount.click();

        // 7. Go back to Omayo
        driver.switchTo().window(parentWindow);

        // 8. Click time enabled button
        wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton"))).click();

        // 9. Read popup text
        wait.until(ExpectedConditions.alertIsPresent());
        String alertText = driver.switchTo().alert().getText();
        System.out.println("Popup Text : " + alertText);

        // 10. Handle popup (OK)
        driver.switchTo().alert().accept();

        // 11. Close browser
        driver.quit();
		
		
	}

}
