package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.System;
public class Selenium_calculator {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
		      System.setProperty("webdriver.gecko.driver","C:\\firefoxdriver\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			  String url="https://testpages.eviltester.com/styled/apps/calculator.html";
		      browser.get(url);
		
	  }
	 
	 
	 
	 
	 // Test 1 : check the addition with two positive numbers 3+3
	 @Test
		public void Tests1() {
	    	
			
				browser.findElement(By.id("button03")).click();
				browser.findElement(By.id("buttonplus")).click();
				browser.findElement(By.id("button03")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				
				browser.findElement(By.id("buttonequals")).click();
			    System.out.println("hello");
				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "6";
				assertEquals(Expected,result);
				browser.findElement(By.id("buttonallclear")).click();
				browser.close();
	 }
	 
	 
	 
	 
	 
	 // Test 2  : check the addition   : 5+0
	 @Test
		public void Tests2() {
	    	
		        
				browser.findElement(By.id("button05")).click();
				browser.findElement(By.id("buttonminus")).click();
				browser.findElement(By.id("button00")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				
				browser.findElement(By.id("buttonequals")).click();
				System.out.println("hello");
				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "5";
				assertEquals(Expected,result);
				browser.findElement(By.id("buttonallclear")).click();
				browser.close();
	 }
	 
	 
	 
	
	  
	  
	 
	 // Test 3 : check the subtraction with two positive numbers 5-3
	 @Test
	 public void Tests3() {
	     
	      
	     browser.findElement(By.id("button05")).click();
	     browser.findElement(By.id("buttonminus")).click();
	     browser.findElement(By.id("button03")).click();
	     try {
	           Thread.sleep(1000);
	         } catch (InterruptedException e) {
	           Thread.currentThread().interrupt();
	         }
	     
	     browser.findElement(By.id("buttonequals")).click();
	     System.out.println("hello");
	     
	     String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	     System.out.println(result);    
	     String Expected= "2";
	     assertEquals(Expected,result);
	     browser.findElement(By.id("buttonallclear")).click();
	     browser.close();
	 }
	  
	  
	  
	 // Test 4 : check the subtraction with two positive numbers  the first one is smaller 3-5
	 @Test
	 public void Tests4() {
	     
	      
	     browser.findElement(By.id("button03")).click();
	     browser.findElement(By.id("buttonminus")).click();
	     browser.findElement(By.id("button05")).click();
	     try {
	           Thread.sleep(1000);
	         } catch (InterruptedException e) {
	           Thread.currentThread().interrupt();
	         }
	     
	     browser.findElement(By.id("buttonequals")).click();
	     System.out.println("hello");
	     
	     String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	     System.out.println(result);    
	     String Expected= "-2";
	     assertEquals(Expected,result);
	     browser.findElement(By.id("buttonallclear")).click();
	     browser.close();
	 }
	  
	  
	  
	 
	// Test 5 division two positive numbers 6/3
	 @Test
	 public void Tests5() {
	     
	    
	     browser.findElement(By.id("button06")).click();
	     browser.findElement(By.id("buttondivide")).click();
	     browser.findElement(By.id("button03")).click();
	     try {
	           Thread.sleep(1000);
	         } catch (InterruptedException e) {
	           Thread.currentThread().interrupt();
	         }
	     
	     browser.findElement(By.id("buttonequals")).click();
	     System.out.println("hello");
	     
	     String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	     System.out.println(result);    
	     String Expected= "2";
	     assertEquals(Expected,result);
	     browser.findElement(By.id("buttonallclear")).click();
	     browser.close();
	 }
	 
	 
	 
	 
	 
	 // Test 6 : division positive number by 0: 3/0
	 @Test
	 public void Tests6() {
	     
	     browser.findElement(By.id("button03")).click();
	     browser.findElement(By.id("buttondivide")).click();
	     browser.findElement(By.id("button00")).click();
	     try {
	           Thread.sleep(1000);
	         } catch (InterruptedException e) {
	           Thread.currentThread().interrupt();
	         }
	     
	     browser.findElement(By.id("buttonequals")).click();
	     System.out.println("hello");
	     
	     String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	     System.out.println(result);    
	     String Expected= "Infinity";
	     assertEquals(Expected,result);
	     browser.findElement(By.id("buttonallclear")).click();
	     browser.close();
	 }
	 
	 
	 
	 
		
	 // Test 7 : division  zero by positive number   0/9
	 @Test
	 public void Tests7() {
	     
	     browser.findElement(By.id("button00")).click();
	     browser.findElement(By.id("buttondivide")).click();
	     browser.findElement(By.id("button09")).click();
	     try {
	           Thread.sleep(1000);
	         } catch (InterruptedException e) {
	           Thread.currentThread().interrupt();
	         }
	     
	     browser.findElement(By.id("buttonequals")).click();
	     System.out.println("hello");
	     
	     String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	     System.out.println(result);    
	     String Expected= "0";
	     assertEquals(Expected,result);
	     browser.findElement(By.id("buttonallclear")).click();
	     browser.close();
	 }
	 
	 
	 
	 
	
	 
	 
	 
	 
	 // Test 8 : multiply  two positive numbers  7*4  
	 @Test
	 public void Tests8() {
	     
	     browser.findElement(By.id("button07")).click();
	     browser.findElement(By.id("buttonmultiply")).click();
	     browser.findElement(By.id("button04")).click();
	     try {
	           Thread.sleep(1000);
	         } catch (InterruptedException e) {
	           Thread.currentThread().interrupt();
	         }
	     
	     browser.findElement(By.id("buttonequals")).click();
	     System.out.println("hello");
	     
	     String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	     System.out.println(result);    
	     String Expected= "28";
	     assertEquals(Expected,result);
	     browser.findElement(By.id("buttonallclear")).click();
	     browser.close();
	 }
	 
	 
	 
	 
	 
	
	 
	 
	 
	 // Test 9 : multiply   positive number with zero  5*0
	 @Test
	 public void Tests9() {
		 browser.findElement(By.id("button00")).click();
	     browser.findElement(By.id("buttonmultiply")).click();
	     browser.findElement(By.id("button05")).click();
	     try {
	           Thread.sleep(1000);
	         } catch (InterruptedException e) {
	           Thread.currentThread().interrupt();
	         }
	     
	     browser.findElement(By.id("buttonequals")).click();
	     System.out.println("hello");
	     
	     String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	     System.out.println(result);    
	     String Expected= "0";
	     assertEquals(Expected,result);
	     browser.findElement(By.id("buttonallclear")).click();
	     browser.close();
	 }
	 
	 
	 
	 
				
				
				
}