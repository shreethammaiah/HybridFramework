package scripts1;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import POM.Homepage;
import POM.LoginPagePage;
import generic.BaseTest;
import generic.Excel;

public class Homepage1 extends BaseTest
{
	@Test
	public void cases() throws InterruptedException 
	{
	driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.DAYS);
	String address=Excel.abc(excelpath,"Sheet1", 0, 0);
	String us=Excel.abc(excelpath,"Sheet1", 1, 0);
	String pwd=Excel.abc(excelpath,"Sheet1", 2, 0);
	//String item=Excel.abc(excelpath,"Sheet1", 3, 0);
	//String item1=Excel.abc(excelpath,"Sheet1", 4, 0);
	driver.get(address);
	//driver.findElement(By.xpath("//img[@alt='My Account']"));

	LoginPagePage l=new LoginPagePage(driver);
	l.login();
	l.username(us);
	l.password(pwd);
	l.submitbutton();

	
	Homepage h=new Homepage(driver);
	Thread.sleep(10000);
	h.myBag();
	Thread.sleep(10000);
	h.continuee();
	}
}
	