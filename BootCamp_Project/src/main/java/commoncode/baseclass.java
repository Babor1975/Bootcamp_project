package commoncode;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class baseclass {
public WebDriver driver;
	
  @BeforeTest
  @Parameters({"url"})
  
  public void beforeClass( String url ) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\babor\\eclipse-workspace\\softweartestingProject_maven_1\\drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
  }
  
 
  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }

}
