package Parallel_ecution;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class P2 {
	@Test
	public void tc2() {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.meesho.com");
		
	}

}
