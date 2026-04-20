package assignment13;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//1) Open the browser  
//2) Maximize the browser window  
//3) Enter into QWS page  
//4) Click Register link  
//5) Fill all the details in the Register form  
//6) Click Register button  
//7) Close the browser  
//
//Condition:  
//- Don’t use any WebElement or WebElement methods  
//- Create a dynamic email 

//1) Open the browser  
//2) Maximize the browser window  
//3) Enter into DWS  
//4) Click Login link  
//5) Fill all the details for Login  
//6) Close the browser  

//Condition:  
//- Register email data must be used for Login  
//- Use the data from the first task (Register)  
//- Tcal → Register  
//- Tcal2 → Login  

public class Class1 {

	public static WebDriver driver;

	public static void preCondition() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}

	public static void register(Actions act, int num) throws InterruptedException {
		act.keyDown(Keys.TAB).perform();
		act.keyDown(Keys.TAB).perform();
		act.keyDown(Keys.ENTER).perform();

		for (int i = 0; i < 24; i++) {
			act.keyDown(Keys.TAB).perform();
		}

		act.keyDown(Keys.TAB).perform();
		act.sendKeys(Keys.SPACE).perform();
		act.keyDown(Keys.TAB).perform();
		act.sendKeys("Tanvir").perform();
		act.keyDown(Keys.TAB).perform();
		act.sendKeys("Kazi").perform();
		act.keyDown(Keys.TAB).perform();
		act.sendKeys("tanvirkazi" + num + "@gmail.com").perform();
		act.keyDown(Keys.TAB).perform();
		act.sendKeys("tanvir@123").perform();
		act.keyDown(Keys.TAB).perform();
		act.sendKeys("tanvir@123").perform();
		act.keyDown(Keys.TAB).perform();
		act.keyDown(Keys.ENTER).perform();

		Thread.sleep(2000);
		for (int i = 0; i < 3; i++) {
			act.keyDown(Keys.TAB).perform();
		}
		act.keyDown(Keys.ENTER).perform();
		Thread.sleep(2000);

	}

	public static void logine(Actions act, int num) throws InterruptedException {
		for (int i = 0; i < 3; i++) {
			act.keyDown(Keys.TAB).perform();
		}
		act.keyDown(Keys.ENTER).perform();
		Thread.sleep(2000);
		act.sendKeys("tanvirkazi" + num + "@gmail.com").perform();
		act.keyDown(Keys.TAB).perform();
		act.sendKeys("tanvir@123").perform();
		act.keyDown(Keys.TAB).perform();
		act.keyDown(Keys.TAB).perform();
		act.keyDown(Keys.TAB).perform();
		act.keyDown(Keys.ENTER).perform();
	}

	public static void postCondition() {
		driver.close();
	}

}
