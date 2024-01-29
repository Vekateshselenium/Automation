package testng;

import org.junit.AfterClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class anotations {
@BeforeClass
public void openbrowser() {
	Reporter.log("...openBrowser",true);
	
}
@BeforeTest
public void class1() {
	Reporter.log("Before class",true);
}
@BeforeTest
public void class2() {
	Reporter.log("Before test",true);
}
@BeforeTest
public void class3() {
	Reporter.log("Before method",true);
}
@BeforeTest
public void class4() {
	Reporter.log("Before class",true);
}
@BeforeTest
public void verifyuserid() {
	Reporter.log("running verify",true);
}
@AfterSuite
public void b1() {
Reporter.log("After suit",true);
}
@AfterMethod
public void b2() {
Reporter.log("After method",true);
}
@AfterClass
public void b3() {
Reporter.log("After class",true);
}
@AfterTest
public void b4() {
Reporter.log("After test",true);
}
@AfterSuite
public void c1() {
Reporter.log("After suit",true);
}
@AfterMethod
public void c2() {
Reporter.log("After method",true);
}
@AfterClass
public void c3() {
Reporter.log("After class",true);
}
@AfterTest
public void c4() {
Reporter.log("After test",true);
}
@Test
public void TC() {
	Reporter.log("Hii",true);
}
}
