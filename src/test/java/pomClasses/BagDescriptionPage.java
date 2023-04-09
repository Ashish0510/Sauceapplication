package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BagDescriptionPage {
	WebDriver driver;
	public BagDescriptionPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy (id="checkout")
	WebElement CheckOut;
	
	@FindBy (id="remove-sauce-labs-backpack")
	WebElement RemoveItem;
	
	@FindBy (xpath="//div[text()='Sauce Labs Backpack']")
	WebElement CheckItem;
	
	@FindBy (id="continue-shopping")
	WebElement ContinueShopping;
	
	
	
	
	public void ClickonCheckout() {
	
	CheckOut.click();
	
	}
	
	public boolean VerifyItemispresent() {
		try {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(CheckItem));
		return true;
		}
		catch( Exception e) {
			e.getMessage();
			return false;
			
		}
		
		
	}
	
	public void toRemoveItem() {
		RemoveItem.click();
	}
	
	public void clickOnContinueShopping() {
		
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",ContinueShopping);*/
		ContinueShopping.click();
		
	}


}
