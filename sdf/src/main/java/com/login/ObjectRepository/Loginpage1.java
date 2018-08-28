package com.login.ObjectRepository;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.Assertion;

import junit.framework.Assert;

public class  Loginpage1 {
	
	
	/* @FindBy(id="email")
	    private WebElement emailid;
	 
	 @FindBy(xpath="//input[@value ='Log In' and starts-with(@id,'u_0_')]")
	 	private WebElement passwd;
	 
	 @FindBy(xpath="//input[@id='pass']")
			 private WebElement login_btn;*/

	public  WebElement getEmailid(WebDriver driver, String eid1) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(eid1);
		System.out.println("here in getEmailid");
		return null;
	}

	

	public WebElement getPasswd(WebDriver driver, String passwords) {
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(passwords);
		return null;
		
		
	}

	
	public WebElement getLogin_btn(WebDriver driver) {
		
		driver.findElement(By.xpath("//input[@value ='Log In' and starts-with(@id,'u_0_')]")).click();
		return null;
	}
	
	public WebElement loginpageVerify(WebDriver driver){
		String loginname = driver.getTitle();
		System.out.println("The title name is :"+loginname);
		assertEquals("Facebook – log in or sign up", loginname);
		String facebook1 = driver.findElement(By.xpath("//u[contains(text(),'Facebook')]")).getText();
		assertEquals(facebook1,"Facebook" );
	return null;
	}

	
	 
	
}
