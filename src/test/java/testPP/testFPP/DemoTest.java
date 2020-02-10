package testPP.testFPP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
	 


	  @Test
	  public void demo() throws InterruptedException{
		  System.out.println("Hello World");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mijkj\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");	

			WebDriver driver=new ChromeDriver();
			
			driver.get("http://tinyupload.com/");
			Thread.sleep(3000);			
			
	
	}

}
