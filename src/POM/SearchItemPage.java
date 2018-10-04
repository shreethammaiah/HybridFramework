package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchItemPage
{
	 @FindBy(xpath="//span[@class='product_title clip-text brandName']")
     private WebElement selectedProduct;
	 @FindBy(id="search-input-field")
	 private WebElement searchtb;
	 @FindBy(xpath="//div[@class='search-btn']")
	  private WebElement searchbtn;
	
	public  SearchItemPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void searchbar(String item)
	{
		
		searchtb.sendKeys(item);
	}
	public void enterSearch() 
	{
		searchbtn.click();
	}
	public void product()
	{
		selectedProduct.click();
	}
}
