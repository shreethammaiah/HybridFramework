package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{
	 @FindBy(xpath="//span[.='MY BAG']")
     private WebElement myBagbtn;
	 @FindBy(xpath="//a[.=' continue shopping ']")
     private WebElement continuebtn;
	  
public  Homepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void myBag()
{
	myBagbtn.click();
}
public void continuee()
{
	continuebtn.click();
}

}

