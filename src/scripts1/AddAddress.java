package scripts1;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import POM.AddAddressPage;
import POM.LoginPagePage;
import generic.BaseTest;
import generic.Excel;
public class AddAddress extends BaseTest
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
	String name=Excel.abc(excelpath,"Sheet1", 5, 0);
	String zip=Excel.abc(excelpath,"Sheet1", 6, 0);
	String city=Excel.abc(excelpath,"Sheet1", 7, 0);
	String addr=Excel.abc(excelpath,"Sheet1", 8, 0);
	String email=Excel.abc(excelpath,"Sheet1", 9, 0);
	String mobile1=Excel.abc(excelpath,"Sheet1", 10, 0);
	driver.get(address);

	LoginPagePage l=new LoginPagePage(driver);
	l.login();
	l.username(us);
	l.password(pwd);
	l.submitbutton();

	
	AddAddressPage p=new AddAddressPage(driver);
	Thread.sleep(10000);
	p.address();
	p.addnewaddress();
	Thread.sleep(10000);
	p.name(name);
	p.zipcode(zip);
	p.city(city);
	p.address(addr);
	p.email(email);
	p.mobileno(mobile1);
	p.save();
	}
	

}