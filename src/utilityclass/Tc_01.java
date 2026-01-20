package utilityclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tc_01 extends BaseClass {

	public static void main(String[] args) throws Exception {
		String expectedResult = "Mobail";
		Thread.sleep(2000);
		preCondition();
		logine();
		Thread.sleep(2000);
		WebElement serchFild = driver.findElement(By.id("small-searchterms"));
		serchFild.sendKeys(expectedResult);

		String actualResult = serchFild.getAttribute("value");

		if (expectedResult.equals(actualResult)) {
			System.out.println("Data is same Testcase is pass");
		} else {
			logOut();
			postCondition();
			System.out.println("Data is not Testcase is failed");
		}
		logOut();
		postCondition();

	}
}
