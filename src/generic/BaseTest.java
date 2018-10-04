package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import generic.Excel;
public class BaseTest implements Auto_Constant
{
public WebDriver driver;
//public static String us,address,pwd;
@BeforeMethod
public void oppenapp()
{
	System.setProperty(key,value);
	driver=new ChromeDriver();
}
@AfterMethod
public void closeapp()
{
	driver.close();
}
}
