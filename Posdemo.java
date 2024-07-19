package com.pos.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Posdemo {
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
	}
	@Test
	public static void task1() throws AWTException {
		
		
		 ChromeDriver driver= new ChromeDriver();
	  	 driver.get("https://www.pos.com.my/");
	  	 driver.manage().window().maximize();
	  	     	 try {
	  	driver.findElement(By.xpath("//img[@alt=\"Pos Close Alert Icon\"]")).click();
	  	 }catch (Exception e)
	  	 {
	  		 System.out.println("no element");
	  	 }
	  	     	WebElement buyInsuranceButton= driver.findElement(By.xpath("//a[@href=\"https://insurance.pos.com.my\"]"));
     	     	 JavascriptExecutor jse= (JavascriptExecutor) driver;
     	      	 jse.executeScript("arguments[0].scrollIntoView(true)", buyInsuranceButton);
     	      Robot robot =new Robot();
     	      	 robot.mouseWheel(-6);
     	                  buyInsuranceButton.click();
     	               Set<String> windowHandles = driver.getWindowHandles();
     	               Iterator it= windowHandles.iterator();
     	               String parentWindow =(String) it.next();
     	String childWindow=(String) it.next();
     	driver.switchTo().window(childWindow);
     	
     	assertEquals("https://insurance.pos.com.my/",driver.getCurrentUrl());     	      
     	driver.findElement(By.xpath("//*[@id=\"vhl\"]/div[1]/div[2]/div/div[1]/div/div[2]")).click();
     	assertTrue(driver.findElement(By.xpath("//input[@placeholder=\"Vehicle Registration Number*\"]")).isDisplayed());
   	assertTrue(driver.findElement(By.xpath("//input[@placeholder=\"Postcode*\"]")).isDisplayed());
   	assertTrue(driver.findElement(By.xpath("//input[@placeholder=\"ID Number*\"]")).isDisplayed()); 
   	assertTrue(driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number*\"]")).isDisplayed());
   	assertTrue(driver.findElement(By.xpath("//div[@class=\"marital-inner-container\"]")).isDisplayed());  
   	
	}
	@Test
public static void test2() throws AWTException {
	
  	 ChromeDriver driver= new ChromeDriver();
  	 driver.get("https://www.pos.com.my/");
  	 driver.manage().window().maximize();
  	     	 try {
  	driver.findElement(By.xpath("//img[@alt=\"Pos Close Alert Icon\"]")).click();
  	 }catch (Exception e)
  	 {
  		 System.out.println("no element");
  	 }
	 WebElement mousehover = driver.findElement(By.xpath("/html/body/app-root/div/app-floating-bar/div[1]/div/div/div/div/div[1]/a"));
    	 Actions action=new Actions(driver);
    	 action.moveToElement(mousehover).perform();
    	 driver.findElement(By.linkText("Parcel")).click();
    	 WebElement scrollingbutton =driver.findElement(By.linkText("Create shipment now"));
    	 JavascriptExecutor jse= (JavascriptExecutor) driver;
    	 jse.executeScript("arguments[0].scrollIntoView(true)", scrollingbutton);
    	 Robot r=new Robot();
      r.mouseWheel(-4);    	      
    	scrollingbutton.click();
    	assertEquals("https://send.pos.com.my/home/e-connote?lg=en",driver.getCurrentUrl());
    assertTrue(driver.findElement(By.id("stepSender")).isDisplayed());
  assertTrue(driver.findElement(By.id("stepReceiver")).isDisplayed());
assertTrue(driver.findElement(By.id("stepParcel")).isDisplayed());
assertTrue(driver.findElement(By.id("stepSummary")).isDisplayed());

}
}
	
	
	
	
	
	
	
	   
	  

