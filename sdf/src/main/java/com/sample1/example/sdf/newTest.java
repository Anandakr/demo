/*package com.sample1.example.sdf;
import java.util.Properties;

import static org.testng.Assert.assertEquals;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hELPER.ScreenShots;


public class newTest {
	private static final String String = null;
	WebDriver driver ;
	Properties p;
	private static String usr1;
	private static String psww;
	
	@BeforeMethod (enabled=false)
	public void openandlaunchbrowser(){
		String exePath = "/home/ANANDA/Downloads/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		 driver = new ChromeDriver();
		 p= new Properties();
		 try {
			 
				FileReader fr = new FileReader("/home/ANANDA/workspace/sdf/Configs/Configuration.properties");
				p.load(fr);
			String url1 =p.getProperty("url");
			System.out.println("url name is:" +url1);

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MICROSECONDS);
			//driver.navigate().to(p.getProperty("url"));
			//driver.get("http://192.168.1.99:8080/prepaid-consumer/consumer/login");
			driver.get(p.getProperty("url"));
			usr1 = p.getProperty("uname");
			psww=p.getProperty("password");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
				
		}
	
	@ Test(priority=1, enabled=false)
public void login_successful() throws Exception{
		
		WebElement username = driver.findElement(By.xpath("//input[@id='loginUser']"));
		username.clear();
		username.sendKeys(p.getProperty("uname"));
		//calling the screen shot method from helper package
		ScreenShots.scccshot(driver, "After_username1");
		WebElement password = driver.findElement(By.xpath("//input[@id='loginPass']"));
		password.clear();
		password.sendKeys(p.getProperty("password"));
		//calling the screen shot method
		ScreenShots.scccshot(driver, "After_password");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement loginbtn = driver.findElement(By.xpath("//input[@id='loginSubmit' and @type='submit']"));
		loginbtn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		WebElement logout = driver.findElement(By.xpath("//*[@id='wrapper']/div/header/div[2]/table[1]/tbody/tr/td/a"));
		String text1 =logout.getText();
		System.out.println("the text element:"+logout.getText());
		
		assertEquals(logout.getText(), "Logout");
		
	System.out.println("this is test");
	
}
	@Test (priority=2 ,enabled=false)
	
	public void invalid_login(){
		
	}

@Test(enabled=false)

public void Only_username_provided(){
	
	System.out.println("This is anand here");
	
}

@Test(enabled =false)
public void getApplicationUrl() {
	//FileReader fr = new FileReader("/sdf/Configs/Configuration.properties");
	
	// in file reader we have to provide the location not path ...
	try {
		FileReader fr = new FileReader("/home/ANANDA/workspace/sdf/Configs/Configuration.properties");

		Properties p = new Properties();
		p.load(fr);
	
		String url = p.getProperty("url");
	
		System.out.println(url);
		System.out.println(p.getProperty("uname"));
		System.out.println(p.getProperty("password"));
		
		FileWriter fw = new FileWriter("/home/ANANDA/workspace/sdf/Configs/Configuration.properties");
		p.setProperty("url1", "anand");
		p.store(fw, null);
		fw.close();
		
	} catch (Exception e) {
		System.out.println(e);
	}
	
	
	
	
		}

@Test(enabled=false)

public void insertValues(){
	javatest1 obj = new javatest1();
	String s1="Girmiti is supub company";
	String s2 ="and excellent";
	int a=17;
	System.out.println(obj.insertIntoStringtest(a, s1, s2));
	
}

@AfterMethod(enabled=false)
public void teardown(){
	
	driver.quit();
}
}


*/