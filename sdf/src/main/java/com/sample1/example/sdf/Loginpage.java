package com.sample1.example.sdf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.login.ObjectRepository.*;
//package com.sample1.example.sdf;

public class Loginpage {
	WebDriver driver;
Loginpage1 l1 = new Loginpage1();

	@BeforeMethod 
	public void openandlaunchbrowser(){
		String exePath = "/home/ANANDA/Downloads/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
	}
		 
		 
	@Test(priority=1)
	// assertions for login page
	public void loginpageAsserions(){
		// check the login page title
		l1.loginpageVerify(driver);
	}
	

@ Test()
@Parameters({"eid","passwords"})
	public void logintest(String eid,String passwords){
	
	
	
	// send the email to text box.
	l1.getEmailid(driver,eid);
	
	
	// send the password to text box
	
	l1.getPasswd(driver,passwords);
	
	
	//click on the click button.
	
	l1.getLogin_btn(driver);
	
	
}
	
}
