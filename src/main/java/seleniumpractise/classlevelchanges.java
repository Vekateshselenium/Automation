package seleniumpractise;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class classlevelchanges {
	@Test
	public void Tc1() {
		Reporter.log("running Tc1",true);
		}
	@Test
	public void Tc2() {
		Reporter.log("running Tc2",true);
		}
	@Test(enabled=true)
	public void Tc3() {
		Reporter.log("running Tc3",true);
		}
}
