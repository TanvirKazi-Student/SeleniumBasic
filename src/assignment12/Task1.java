package assignment12;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement uiClick = driver.findElement(By.xpath("//p[text()='UI Testing Concepts']"));
		act.moveToElement(uiClick).click(uiClick).perform();
		Thread.sleep(2000);
		WebElement mousAction = driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		act.click(mousAction).perform();
		WebElement dragdrop = driver.findElement(By.xpath("//section[@class='poppins text-[14px]']"));
		act.moveToElement(dragdrop).click(dragdrop).perform();
		Thread.sleep(3000);
		WebElement dragme = driver.findElement(By.xpath("//section[@class='poppins text-[14px]']"));
		act.clickAndHold(dragme).release(dragme).perform();
		Thread.sleep(2000);
		
		WebElement dragPosition = driver.findElement(By.xpath("//a[text()='Drag Position']"));
		act.click(dragPosition).perform();
		Thread.sleep(3000);
		List<WebElement> sorce = driver.findElements(By.xpath("//div[@class='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
		for (WebElement web : sorce) {

			act.dragAndDrop(web, target).perform();
			Thread.sleep(1000);
		}
		
		WebElement dragsPosition = driver.findElement(By.xpath("//a[text()='Drag Multiple']"));
		act.click(dragsPosition).perform();

		Thread.sleep(4000);
		WebElement laptopChrger = driver.findElement(By.xpath("//div[@id='dragElement1']"));
		
		WebElement mobailCover = driver.findElement(By.xpath("//div[@id='dragElement2']"));
		
		WebElement laptopcover = driver.findElement(By.xpath("//div[@id='dragElement3']"));
		
		WebElement mobailCharger = driver.findElement(By.xpath("//div[@id='dragElement4']"));
	
		
		WebElement target1 = driver.findElement(By.xpath("//div[@id='dropZone1']"));
		act.keyDown(Keys.CONTROL).click(mobailCover).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).click(mobailCharger).perform();
		Thread.sleep(2000);
		act.dragAndDrop(mobailCover, target1).perform();
		act.dragAndDrop(mobailCharger, target1).perform();
        
		WebElement target2 = driver.findElement(By.xpath("//div[@id='dropZone2']"));
		act.keyDown(Keys.CONTROL).click(laptopChrger).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).click(laptopcover).perform();
		Thread.sleep(2000);
		act.dragAndDrop(laptopChrger, target2).perform();
		act.dragAndDrop(laptopcover, target2).perform();
		
		Thread.sleep(2000);
		driver.close();
	}

}
