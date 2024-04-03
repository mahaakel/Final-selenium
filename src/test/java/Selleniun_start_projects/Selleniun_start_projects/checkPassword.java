package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkPassword {
	
 static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\firefoxdriver\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			  String url = "https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html";
		      browser.get(url);
		
	  }
	 
	 // test 1 correct password Maha123
	 @Test
	 public void CorrectPassword1 () {
		 browser.findElement(By.name("characters")).sendKeys("Maha123");
		 browser.findElement(By.name("validate")).click();
		 String expectedResult = "Valid Value";
		 String result= browser.findElements(By.name("validation_message")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
		 	 
	 }
	 
	 // Test 2 short password Mah123
	 @Test
	 public void shortPassword2 () {
		 browser.findElement(By.name("characters")).sendKeys("Mha123");
		 browser.findElement(By.name("validate")).click();
		 String expectedResult = "Invalid Value";
		 String result= browser.findElements(By.name("validation_message")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
		 	 
	 }
	 
	 
	 // Test 3 with tall password Maha12345
	 @Test
	 public void tallPassword3 () {
		 browser.findElement(By.name("characters")).sendKeys("Maha12345");
		 browser.findElement(By.name("validate")).click();
		 String expectedResult = "Invalid Value";
		 String result= browser.findElements(By.name("validation_message")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
		 	 
	 }
	 
	 
	 
	 // Test 4 with @ in the password and 7 digits  maha@34
	 @Test
	 public void incorrectPassword4 () {
		 browser.findElement(By.name("characters")).sendKeys("maha@34");
		 browser.findElement(By.name("validate")).click();
		 String expectedResult = "Invalid Value";
		 String result= browser.findElements(By.name("validation_message")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
		 	 
	 }
	 
	 
	 /// Test 5  incorrect Password with ! in the password and 7 digits "maha!34"
	 @Test
	 public void incorrectPassword5 () {
		 browser.findElement(By.name("characters")).sendKeys("maha!34");
		 browser.findElement(By.name("validate")).click();
		 String expectedResult = "Invalid Value";
		 String result= browser.findElements(By.name("validation_message")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
		 	 
	 }
	 
	 
	 // Test 6  incorrect Password  maha&11
	 @Test
	 public void incorrectPassword6 () {
		 browser.findElement(By.name("characters")).sendKeys("maha&11");
		 browser.findElement(By.name("validate")).click();
		 String expectedResult = "Invalid Value";
		 String result= browser.findElements(By.name("validation_message")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
		 	 
	 }
	 
	 
	 
	 
	 
	 

}
