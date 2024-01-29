package Parallel_ecution;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class P1 {
@Test
public void tc1() {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
}

	
}
