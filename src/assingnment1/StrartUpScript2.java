package assingnment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class StrartUpScript2 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=9561049422145643986&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062099&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
	
		driver.close();
	}
}

