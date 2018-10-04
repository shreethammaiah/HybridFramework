package scripts1;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import POM.AddToCartPage;
import POM.AddToWishListPage;
import POM.LoginPagePage;
import POM.RemoveFromCartPage;
import POM.SearchItemPage;
import POM.UsingFilterPage;
import generic.BaseTest;
import generic.Excel;
public class UsingFilter extends BaseTest
{
	@Test
	public void cases() throws InterruptedException 
	{
	driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.DAYS);
	String address=Excel.abc(excelpath,"Sheet1", 0, 0);
	String us=Excel.abc(excelpath,"Sheet1", 1, 0);
	String pwd=Excel.abc(excelpath,"Sheet1", 2, 0);
	String item=Excel.abc(excelpath,"Sheet1", 3, 0);
	String item1=Excel.abc(excelpath,"Sheet1", 4, 0);
	driver.get(address);
	

	LoginPagePage l=new LoginPagePage(driver);
	l.login();
	l.username(us);
	l.password(pwd);
	l.submitbutton();

	
	/*Homepage h=new Homepage(driver);
	h.myBag();
	Thread.sleep(10000);
	h.continuee();	
	*/

	SearchItemPage o=new SearchItemPage(driver);
	o.searchbar(item);
	o.enterSearch();
	o.product();
	
	
/*	AddToCartPage c=new AddToCartPage(driver);
	c.size();
	Thread.sleep(10000);
	c.add();
	
	

	AddToWishListPage w=new AddToWishListPage(driver);
	Thread.sleep(10000);
	w.wishList();
	Thread.sleep(10000);
	w.goToBag();
	
	
	
	RemoveFromCartPage r=new RemoveFromCartPage(driver);
	Thread.sleep(10000);
	r.remove();
*/
	
	
	UsingFilterPage f=new UsingFilterPage(driver);
	Thread.sleep(20000);
	f.continuetoShop();
	f.searchbar1(item1);
	f.enterSearch1();
	f.choose();
	Thread.sleep(10000);
	f.product1();
	f.size1();
	f.add1();
	Thread.sleep(10000);
	f.goToBag1();
	
	}
}
	