package hELPER;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScreenShots {
	//WebDriver driver;
	public static void scccshot(WebDriver driver,String filename) throws Exception{
	TakesScreenshot ts = (TakesScreenshot) driver;
	File scr = ts.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(scr, new File("/home/ANANDA/workspace/sdf/screenshots"+filename+".png"));
System.out.println("sdfasdf");
	}
	
}
