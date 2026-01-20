package assingnment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class StratUpScript5 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/shop/men?&utm_source=google&utm_medium=cpc&utm_campaign=GSB_Brand_TROAS_Sept2025&gad_source=1&gad_campaignid=23011145465&gbraid=0AAAAADP0Dve_KJroV8lx0KNbNcJtJ7U6A&gclid=Cj0KCQiA5abIBhCaARIsAM3-zFX7Be3PNDQlmAraAaVWYK-YfCoguoTa71W0nmf6_dnYPtOwLHol_uEaAqQFEALw_wcB");
		
		driver.close();
	}
}
