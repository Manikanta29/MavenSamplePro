package example;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class OpenGuru99 {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {
			
			System.out.println("I am in Test method");			
			driver.get("http://demo.guru99.com/selenium/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@BeforeTest
		public void beforeTest() throws InterruptedException{
			
			System.out.println("I am in Before Test");
			
			String chromeDriverPath = "/Users/manikanta/git/MavenSamplePro/mavenjenkinsconfig/src/test/java/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
		    //driver = new FirefoxDriver();  
		}
		
		@AfterTest
		public void afterTest() {
			System.out.println("I am in After Test");
			driver.quit();			
		}		
}	
