package pomClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {
	WebDriver driver;
	public ProductListPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	WebElement ParticularPro;
	
	@FindBy(xpath="//button[text()='Open Menu']")
	WebElement DropDown;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement clickDropDown;
	
	
	public void ClickingOnProduct() {
		ParticularPro.click();
	}
	
	public void ClickOnDropdown() {
		clickDropDown.click();
		List<WebElement> elements = driver.findElements(By.xpath("//nav[@class='bm-item-list']/a"));
		for (WebElement ele:elements) {
				System.out.println(ele.getText());
				if((ele.getText()).equals("Logout")) {
					ele.click();
					System.out.println("the logout button is clicked");
					break;
				}
			
		}
	}
	

}
