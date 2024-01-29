import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class parallel {
	@Test
	public void p1 () {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
	}
	
	
 
}