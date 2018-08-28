
package Testing_samples;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Window_Handling {
	WebDriver driver;
	@Test
	public void Handling_windows(){
		
		String exePath = "/home/ANANDA/Downloads/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		String guru99=driver.getWindowHandle();
		System.out.println("The guru 99 window is:"+ guru99);
		//String exePath1 = "/home/ANANDA/Downloads/chromedriver";
		/*System.setProperty("webdriver.chrome.driver", exePath);
		driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");*/
		
		Set<String> s = driver.getWindowHandles();
		System.out.println("the size of total windowsd :" + s.size());
		
		System.out.println(s);
	}
	
	

}
