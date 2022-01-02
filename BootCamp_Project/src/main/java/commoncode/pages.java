package commoncode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pages {
public static WebDriver driver;


@FindBy (xpath="(//*[@class='MyAccount__label SimpleFlyout__link--bold'])[1]" ) WebElement account;
@FindBy (xpath="(//*[@class='bttn__content'])[8]") WebElement signIn;
@FindBy (id="username") WebElement userId;
@FindBy (xpath="(//*[@class='bttn__content'])[1]") WebElement contBtn ;


public pages (WebDriver driver) {
pages.driver = driver;
PageFactory.initElements(driver,this );
}
	
public void accountClick () {
	account.click();
}
public void signInBtn() {
	signIn.click();	
}

public void idName(String emailtext) {
	userId.sendKeys(emailtext);
}

public void continueBtn() {
	contBtn.click();	
}

} 
