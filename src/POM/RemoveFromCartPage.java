package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveFromCartPage
{
	@FindBy(xpath="//img[@src='//images.koovs.com/images/kv/close_32.png']")
    private WebElement deletebtn;
	
	 public RemoveFromCartPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	}
	public void remove()
	 {
		 deletebtn.click();
	 }

}




