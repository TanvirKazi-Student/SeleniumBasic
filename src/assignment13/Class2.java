package assignment13;

import java.util.Random;

import org.openqa.selenium.interactions.Actions;

public class Class2 extends Class1 {

	public static void main(String[] args) throws InterruptedException {
		preCondition();
		Random r = new Random();
		int num = r.nextInt(1000, 2000);
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		register(act, num);
		logine(act, num);
		postCondition();
	}
}
