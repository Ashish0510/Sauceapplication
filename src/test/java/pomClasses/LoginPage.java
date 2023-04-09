package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='user-name']")
	WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement pass;

	@FindBy(xpath = "//input[@id='login-button']")
	WebElement Login;

	@FindBy(xpath = "//span[text()='Products']")
	WebElement Title;

	public boolean username(String name, String passw) throws InterruptedException {
		try {
			username.sendKeys(name);
			Thread.sleep(2000);
			pass.sendKeys(passw);
			Thread.sleep(2000);
			Login.click();

			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(Title));
			return true;
		} catch (Exception e) {
			e.getMessage();
			return false;
		}

	}

}
