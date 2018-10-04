package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePage
{
	 @FindBy(xpath="//img[@alt='My Account']")
	 private WebElement loginbtn;
	@FindBy(id="login-email")
	private WebElement usernametb;
    @FindBy(id="login-pswd")
    private WebElement passwordtb;
    @FindBy(xpath="//button[@type='button']")
    private WebElement submitbtn;    

public LoginPagePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void username(String us)
{
	usernametb.sendKeys(us);
}
public void password(String pwd)
{
	passwordtb.sendKeys(pwd);
}
public void submitbutton()
{
	submitbtn.click();
}
public void login()
{
	loginbtn.click();
}

}
