package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToWishListPage
{
	@FindBy(id="wish-txt")
	 private WebElement wishbtn;
	@FindBy(xpath="//span[.='MY BAG']")
    private WebElement goToBagbtn;
	 public  AddToWishListPage(WebDriver driver)
	 {
	 	PageFactory.initElements(driver, this);
	 }
	 public void wishList()
	 {
	 wishbtn.click();
	 }
	 public void goToBag()
	 {
	 	goToBagbtn.click();
	 }
	 
}
