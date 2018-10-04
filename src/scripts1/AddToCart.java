package scripts1;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import POM.AddToCartPage;
import POM.LoginPagePage;
import POM.SearchItemPage;
import generic.BaseTest;
import generic.Excel;
public class AddToCart extends BaseTest
{
	@Test
	public void cases() throws InterruptedException 
	{
	driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.DAYS);
	String address=Excel.abc(excelpath,"Sheet1", 0, 0);
	String us=Excel.abc(excelpath,"Sheet1", 1, 0);
	String pwd=Excel.abc(excelpath,"Sheet1", 2, 0);
	String item=Excel.abc(excelpath,"Sheet1", 3, 0);
	//String item1=Excel.abc(excelpath,"Sheet1", 4, 0);
	driver.get(address);
	

	LoginPagePage l=new LoginPagePage(driver);
	l.login();
	l.username(us);
	l.password(pwd);
	l.submitbutton();

	
	/*Homepage h=new Homepage(driver);
	h.myBag();
	h.continuee();	*/
	

	SearchItemPage o=new SearchItemPage(driver);
	o.searchbar(item);
	o.enterSearch();
	o.product();
	
	
	AddToCartPage c=new AddToCartPage(driver);
	c.size();
	Thread.sleep(10000);
	c.add();
	}
}
	