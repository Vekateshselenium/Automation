package seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class iframes {

	private static String txt;

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","C:\\Users\\prasa\\Downloads\\edgedriver_win64 (3)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.id("fname")).clear();
		driver.findElement(By.id("fname")).sendKeys("venkatesh");
		//again back to main web page
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		//to frame 1st to 2nd
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.id("iname")).clear();
		driver.findElement(By.id("iname")).sendKeys("guddu");
		//driver.findElement(By.xpath("//input[@type='submit']")).submit();String
		 txt=driver.findElement(By.xpath("//p[.='if you click the\"Sbmit\"button,the form-data will be sent to a paga called\"/action_page.php\".']")).getText();
		 System.out.println(txt);
	}

	}

