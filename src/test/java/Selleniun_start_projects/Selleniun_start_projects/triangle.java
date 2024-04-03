package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.apache.http.impl.conn.tsccm.WaitingThread;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class triangle {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
		  System.setProperty("webdriver.gecko.driver","C:\\firefoxdriver\\geckodriver.exe");
	      browser = new FirefoxDriver();
	  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  String url = "https://testpages.eviltester.com/styled/apps/triangle/triangle001.html";
	      browser.get(url);
	
	  }
	
	 
	 // Test 1 Scalene triangle with 3,4,5 nominal
	@Test
	public void Tests1() {
   	
		
		 browser.findElement(By.name("side1")).sendKeys("3");
		 browser.findElement(By.name("side2")).sendKeys("4");
		 browser.findElement(By.name("side3")).sendKeys("5");
		 String expectedResult = "Scalene";
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
   }
	
	
	
	
	/// boundary cases :
	/// 1,1,1 Equilateral triangle
	@Test
	public void smallest() {
   	
		
		 browser.findElement(By.name("side1")).sendKeys("1");
		 browser.findElement(By.name("side2")).sendKeys("1");
		 browser.findElement(By.name("side3")).sendKeys("1");
		 String expectedResult = "Equilateral";
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
	}
	
	
	
	/// the max values:100, 100,100
	@Test
	public void maxValue() {
   	
		
		 browser.findElement(By.name("side1")).sendKeys("100");
		 browser.findElement(By.name("side2")).sendKeys("100");
		 browser.findElement(By.name("side3")).sendKeys("100");
		 String expectedResult = "Equilateral";
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
	}
	
  
	
	
	
	
	 // Test 2  Isosceles triangle with 5,5,3
	@Test
	public void Tests2() {
  	
		
		 browser.findElement(By.name("side1")).sendKeys("5");
		 browser.findElement(By.name("side2")).sendKeys("5");
		 browser.findElement(By.name("side3")).sendKeys("3");
		 String expectedResult = "Isosceles";
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
  }
	
	
	 // Test 3  Equilateral triangle with 5,5,5
	@Test
	public void Tests3() {
 	
		
		 browser.findElement(By.name("side1")).sendKeys("5");
		 browser.findElement(By.name("side2")).sendKeys("5");
		 browser.findElement(By.name("side3")).sendKeys("5");
		 String expectedResult = "Equilateral";
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
 }
	
	
	
	
	 // Test 4  Not a triangle with 1,2,8
	@Test
	public void Tests4() {
	
		
		 browser.findElement(By.name("side1")).sendKeys("1");
		 browser.findElement(By.name("side2")).sendKeys("2");
		 browser.findElement(By.name("side3")).sendKeys("8");
		 String expectedResult = "Error: Not a Triangle";
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
   }
	
	
	
	
	/// all negative :
	@Test
	public void negativeValues() {
	
		
		 browser.findElement(By.name("side1")).sendKeys("-6");
		 browser.findElement(By.name("side2")).sendKeys("-1");
		 browser.findElement(By.name("side3")).sendKeys("-2");
		 String expectedResult = "Error: Not a Triangle";
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
	}
	
	
	 // Test 5 with wrong input 2,3,-5
		@Test
		public void Tests5() {
		
			
			 browser.findElement(By.name("side1")).sendKeys("2");
			 browser.findElement(By.name("side2")).sendKeys("3");
			 browser.findElement(By.name("side3")).sendKeys("-5");
			 String expectedResult = "Error: Not a Triangle";
			 browser.findElement(By.id("identify-triangle-action")).click();
			 String result= browser.findElements(By.id("triangle-type")).toString();
			 assertNotEquals(result ,expectedResult);
			 browser.close();
	   }
		
		
		
		
		
		
		/// all zero
		@Test
		public void zero() {
		
			
			 browser.findElement(By.name("side1")).sendKeys("0");
			 browser.findElement(By.name("side2")).sendKeys("0");
			 browser.findElement(By.name("side3")).sendKeys("0");
			 String expectedResult = "Error: Not a Triangle";
			 browser.findElement(By.id("identify-triangle-action")).click();
			 String result= browser.findElements(By.id("triangle-type")).toString();
			 assertNotEquals(result ,expectedResult);
			 browser.close();
		}
		
		
		
		
		// zero and positive sides :
		@Test
		public void Tests6() {
		
			
			 browser.findElement(By.name("side1")).sendKeys("3");
			 browser.findElement(By.name("side2")).sendKeys("0");
			 browser.findElement(By.name("side3")).sendKeys("7");
			 String expectedResult = "Error: Not a Triangle";
			 browser.findElement(By.id("identify-triangle-action")).click();
			 String result= browser.findElements(By.id("triangle-type")).toString();
			 assertNotEquals(result ,expectedResult);
			 browser.close();
		}
		
		
		// max -1 and nominal:
		@Test
		public void Tests7() {
		
			
			 browser.findElement(By.name("side1")).sendKeys("99");
			 browser.findElement(By.name("side2")).sendKeys("56");
			 browser.findElement(By.name("side3")).sendKeys("45");
			 String expectedResult = "Scalene";
			 browser.findElement(By.id("identify-triangle-action")).click();
			 String result= browser.findElements(By.id("triangle-type")).toString();
			 assertNotEquals(result ,expectedResult);
			 browser.close();
		}
	
	
	
	
	
	
	
	
	
	
	
	

}
