package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAddressPage
{
	 @FindBy(xpath="//p[.='Address Details']")
	 private WebElement addressbtn;
	 @FindBy(xpath="//b[@class='checkoutSprite addNewAddressBar']")
	    private WebElement newaddressbtn;
    @FindBy(name="card_name")
    private WebElement nametb;
    @FindBy(id="card_zip")
	private WebElement zipcodetb;
    @FindBy(id="card_city")
	private WebElement citytb;
    @FindBy(id="card_address")
   	private WebElement adderesstb;
    @FindBy(id="card_email")
   	private WebElement emailtb;
    @FindBy(id="card_mobile")
   	private WebElement mobiletb;
    @FindBy(id="myAcc_addres_save")
   	private WebElement savebtn;
       

public AddAddressPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void zipcode(String zip)
{
	 zipcodetb.sendKeys(zip);
}
public void newadderess(String newadd)
{
	newaddressbtn.sendKeys(newadd);
}
public void address()
{
	addressbtn.click();
}
public void addnewaddress()
{
	newaddressbtn.click();
}
public void city(String city)
{
	citytb.sendKeys(city);
}
public void address(String addressnew)
{
	adderesstb.sendKeys(addressnew);
}
public void name(String name)
{
	nametb.sendKeys(name);
}
public void email(String email)
{
	emailtb.sendKeys(email);
}
public void mobileno(String mobile)
{
	mobiletb.sendKeys(mobile);
}
public void save()
{
	savebtn.click();
}

}
