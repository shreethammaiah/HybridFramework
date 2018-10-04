package scripts1;


import org.testng.annotations.Test;

import POM.LoginPagePage;
import generic.BaseTest;
import generic.Excel;
public class Login extends BaseTest
{
	@Test
	public void cases() 
	{
		String address=Excel.abc(excelpath,"Sheet1", 0, 0);
		String us=Excel.abc(excelpath,"Sheet1", 1, 0);
		String pwd=Excel.abc(excelpath,"Sheet1", 2, 0);
	//driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.DAYS);
		driver.get(address);
		

	LoginPagePage l=new LoginPagePage(driver);
	l.login();
	l.username(us);
	l.password(pwd);
	l.submitbutton();
}
}