package regression;

import org.testng.annotations.Test;

import commoncode.baseclass;
import commoncode.pages;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class NewTest extends baseclass {
public WebDriver driver; 
 
  @Test
  public void test1() {
	  pages ob=new pages(driver);
	  ob.accountClick();
	  ob.signInBtn();
	  ob.idName("babor@gmail.com");
	  ob.continueBtn();
	  
	  
  }
  
  
  
}
