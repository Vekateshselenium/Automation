import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallel2 {
	public class parallel {
		@Test
		public void p2() {
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com");
		}
}
}
 