package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage 
{
	@FindBy(xpath="//a[.='28']")
    private WebElement selectSize;
	 @FindBy(xpath="//div[@class='lbl-bag ltr-spcng']")
     private WebElement addProduct;
	 
	
	 
public  AddToCartPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void size()
{
selectSize.click();
}
public void add()
{
addProduct.click();
}

}
