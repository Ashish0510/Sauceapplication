package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToProduct {
	WebDriver driver;
	public AddToProduct(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	

	@FindBy(xpath="//button[text()='Add to cart']") 
	WebElement AddToBag;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']") 
	WebElement CheckBag;
	
	public void AddProduct() {
		AddToBag.click();
	}
	
	public void LookIntoBag() {
		CheckBag.click();
	}

}
