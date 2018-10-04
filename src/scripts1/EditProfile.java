package scripts1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import POM.AddToCartPage;
import POM.AddToWishListPage;
import POM.CartToWishListPage;
import POM.Homepage;
import POM.LoginPagePage;
import POM.RemoveFromCartPage;
import POM.EditProfilePage;
import POM.SearchItemPage;
import POM.UsingFilterPage;
import generic.BaseTest;
import generic.Excel;
public class EditProfile extends BaseTest
{
	@Test
	public void cases() throws InterruptedException 
	{
	driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.DAYS);
	String address=Excel.abc(excelpath,"Sheet1", 0, 0);
	String us=Excel.abc(excelpath,"Sheet1", 1, 0);
	String pwd=Excel.abc(excelpath,"Sheet1", 2, 0);
	Excel.abc(excelpath,"Sheet1", 3, 0);
	Excel.abc(excelpath,"Sheet1", 4, 0);
	String last=Excel.abc(excelpath,"Sheet1", 11, 0);
	driver.get(address);
	

	LoginPagePage l=new LoginPagePage(driver);
	l.login();
	l.username(us);
	l.password(pwd);
	l.submitbutton();

	EditProfilePage ed=new EditProfilePage(driver);
	Thread.sleep(10000);
	ed.view();
	ed.edit();
	ed.addLastName(last);
	ed.save();
	ed.choosedate();
	
	}
}