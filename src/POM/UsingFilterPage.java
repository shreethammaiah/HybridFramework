package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsingFilterPage 
{
	@FindBy(xpath="//a[.=' continue shopping ']")
    private WebElement continuee;
	@FindBy(id="search-input-field")
	 private WebElement searchtb1;
	 @FindBy(xpath="//div[@class='search-btn']")
	  private WebElement searchbtn1;
	 @FindBy(xpath="(//div[@class='label_checkbox'])[4]")
	  private WebElement checkbox;
	 @FindBy(xpath="//span[@class='product_title clip-text brandName']")
	 private WebElement product1;
	 @FindBy(xpath="//a[.='S']")
	  private WebElement selectSize1;
	 @FindBy(xpath="//div[@class='lbl-bag ltr-spcng']")
	 private WebElement addProduct1;
	 @FindBy(xpath="//div[@class='go-bag ltr-spcng']")
	 private WebElement goToBagbtn1;
	 
	 public  UsingFilterPage(WebDriver driver)
	 {
	 	PageFactory.initElements(driver, this);
	 }
	 public void continuetoShop()
	 {
		 continuee.click();
	 }
	 public void searchbar1(String item1)
		{
			
			searchtb1.sendKeys(item1);
		}
		public void enterSearch1() 
		{
			searchbtn1.click();
		}
		public void choose() 
		{
			checkbox.click();
		}
		public void product1() 
		{
			product1.click();
		}
		public void size1()
		{
		selectSize1.click();
		}
		public void add1()
		{
		addProduct1.click();
		}
		public void goToBag1()
		{
			goToBagbtn1.click();
		}

}

