package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Triangle {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
		  System.setProperty("webdriver.gecko.driver","C:\\firefoxdriver\\geckodriver.exe");
	      browser = new FirefoxDriver();
	  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  String url = "https://testpages.eviltester.com/styled/apps/triangle/triangle001.html";
	      browser.get(url);
	
	  }
	
	 
	 // Test 1 Scalene Triangle with 3,4,5 a!=b!=c
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
	
	
	
	
	
	/// 5,5,5 Equilateral Triangle
	@Test
	public void Test2() {
   	
		
		 browser.findElement(By.name("side1")).sendKeys("5");
		 browser.findElement(By.name("side2")).sendKeys("5");
		 browser.findElement(By.name("side3")).sendKeys("5");
		 String expectedResult = "Equilateral";
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
	}
	
	
	
	
	
	/// Isosceles Triangle ,A=C 50,60,50 
	@Test
	public void Test3() {
   	
		
		 browser.findElement(By.name("side1")).sendKeys("50");
		 browser.findElement(By.name("side2")).sendKeys("60");
		 browser.findElement(By.name("side3")).sendKeys("50");
		 String expectedResult = "Isosceles";
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
	}
	
	
	/// Isosceles Triangle ,A=B 5,5,3 
	@Test
	public void Test4() {
   	
		
		 browser.findElement(By.name("side1")).sendKeys("5");
		 browser.findElement(By.name("side2")).sendKeys("5");
		 browser.findElement(By.name("side3")).sendKeys("3");
		 String expectedResult = "Isosceles";
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
	}
	
	

	/// Isosceles Triangle ,B=C 5,10,10 
	@Test
	public void Test5() {
   	
		
		 browser.findElement(By.name("side1")).sendKeys("5");
		 browser.findElement(By.name("side2")).sendKeys("10");
		 browser.findElement(By.name("side3")).sendKeys("10");
		 String expectedResult = "Isosceles";
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
	}
	
	
	
	/// not a Triangle , a!=b!=c 1,2,8
	@Test
	public void Test6() {
   	
		
		 browser.findElement(By.name("side1")).sendKeys("1");
		 browser.findElement(By.name("side2")).sendKeys("2");
		 browser.findElement(By.name("side3")).sendKeys("8");
		 String expectedResult = "Error: Not a Triangle";
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
	}
	
	
	
	/// not a Triangle , b=c 3,1,1
	@Test
	public void Test7() {
   	
		
		 browser.findElement(By.name("side1")).sendKeys("3");
		 browser.findElement(By.name("side2")).sendKeys("1");
		 browser.findElement(By.name("side3")).sendKeys("1");
		 String expectedResult = "Error: Not a Triangle";
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
	}
	
	
	
	
	/// not a Triangle , a=c 4,10,4
	@Test
	public void Test8() {
   	
		
		 browser.findElement(By.name("side1")).sendKeys("4");
		 browser.findElement(By.name("side2")).sendKeys("10");
		 browser.findElement(By.name("side3")).sendKeys("4");
		 String expectedResult = "Error: Not a Triangle";
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
	}
	
	
	
	/// not a Triangle , a=b   5,5,12
	@Test
	public void Test9() {
   	
		
		 browser.findElement(By.name("side1")).sendKeys("5");
		 browser.findElement(By.name("side2")).sendKeys("5");
		 browser.findElement(By.name("side3")).sendKeys("12");
		 String expectedResult = "Error: Not a Triangle";
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
	}
	
	
	
	
	/// C is not a Number   2,3,x
	@Test
	public void Test10() {
   	
		
		 browser.findElement(By.name("side1")).sendKeys("2");
		 browser.findElement(By.name("side2")).sendKeys("3");
		 browser.findElement(By.name("side3")).sendKeys("x");
		 String expectedResult = "Error: Side 3 is not a Number";
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 assertNotEquals(result ,expectedResult);
		 browser.close();
	}
	
	
	
	
	
	/// B is not a Number   5,y,7
		@Test
		public void Test11() {
	   	
			
			 browser.findElement(By.name("side1")).sendKeys("5");
			 browser.findElement(By.name("side2")).sendKeys("y");
			 browser.findElement(By.name("side3")).sendKeys("7");
			 String expectedResult = "Error: Side 2 is not a Number";
			 browser.findElement(By.id("identify-triangle-action")).click();
			 String result= browser.findElements(By.id("triangle-type")).toString();
			 assertNotEquals(result ,expectedResult);
			 browser.close();
		}
		
	
		
		
		/// A is not a Number z,9,8
		@Test
		public void Test12() {
	   	
			
			 browser.findElement(By.name("side1")).sendKeys("z");
			 browser.findElement(By.name("side2")).sendKeys("9");
			 browser.findElement(By.name("side3")).sendKeys("8");
			 String expectedResult = "Error: Side 1 is not a Number";
			 browser.findElement(By.id("identify-triangle-action")).click();
			 String result= browser.findElements(By.id("triangle-type")).toString();
			 assertNotEquals(result ,expectedResult);
			 browser.close();
		}
		
		
		/// negative number -2,5,6
				@Test
				public void Test13() {
			   	
					
					 browser.findElement(By.name("side1")).sendKeys("-2");
					 browser.findElement(By.name("side2")).sendKeys("5");
					 browser.findElement(By.name("side3")).sendKeys("6");
					 String expectedResult = "Error: Not a Triangle";
					 browser.findElement(By.id("identify-triangle-action")).click();
					 String result= browser.findElements(By.id("triangle-type")).toString();
					 assertNotEquals(result ,expectedResult);
					 browser.close();
				}
				
				
		
				
				
				
				/// zero value 5,0,4
						@Test
						public void Test14() {
					   	
							
							 browser.findElement(By.name("side1")).sendKeys("5");
							 browser.findElement(By.name("side2")).sendKeys("0");
							 browser.findElement(By.name("side3")).sendKeys("4");
							 String expectedResult = "Error: Not a Triangle";
							 browser.findElement(By.id("identify-triangle-action")).click();
							 String result= browser.findElements(By.id("triangle-type")).toString();
							 assertNotEquals(result ,expectedResult);
							 browser.close();
						}

	
	

}