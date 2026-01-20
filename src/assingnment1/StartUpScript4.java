package assingnment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpScript4 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.meesho.com/?srsltid=AfmBOoqCn4SIOT4qTK6TioV789tYvACfN5c8EvFb6Xs3D5HUtfz_XxEi");
	
		driver.close();
	}
}
