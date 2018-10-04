package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CartToWishListPage 
{
	@FindBy(xpath="//div[@class='wish-action']")
    private WebElement cartwish;
	@FindBy(xpath="//a[.=' continue shopping ']")
    private WebElement continuee;

public  CartToWishListPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void cartToWish()
{
	cartwish.click();
}
public void continuetoShop()
{
	 continuee.click();
}
}
