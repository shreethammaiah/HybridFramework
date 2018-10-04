package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfilePage 
{
	
	@FindBy(id="editbutton")
	 private WebElement viewbtn;
	@FindBy(id="profile_edit")
	 private WebElement editbtn;
	@FindBy(id="lastname")
	 private WebElement lastnametb;
	@FindBy(id="profile_save")
	 private WebElement savebtn;
	@FindBy(id="mydate")
	 private WebElement datetb;
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	 private WebElement datepickbtn;

public EditProfilePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void view()
{
	viewbtn.click();
}
public void edit()
{
editbtn.click();
}
public void addLastName(String last)
{
lastnametb.sendKeys(last);
}
public void save()
{
savebtn.click();
}
public void choosedate()
{
		datetb.click();
}
public void datepick()
{
		datepickbtn.click();
}
}

