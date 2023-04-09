package AllTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.AddToProduct;
import pomClasses.BagDescriptionPage;
import pomClasses.LoginPage;
import pomClasses.ProductListPage;

public class ToVerifyLoginTest extends BaseClassTest {
	
	@Test(priority=1)
	public void LoginTest() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		boolean loginTest = lp.username("standard_user","secret_sauce");
		if(loginTest) {
			Assert.assertTrue(true);
			System.out.println("login is passed we got the true from login");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("login is failed we got the false from login");
		}
		
	}
	
	
	@Test(priority=2)
	public void ClickOnProductTest() throws InterruptedException {
		ProductListPage plp=new ProductListPage(driver);
		plp.ClickingOnProduct();
		Thread.sleep(2000);
		AddToProduct atp=new AddToProduct(driver);
		atp.AddProduct();
		atp.LookIntoBag();
		
		BagDescriptionPage bdp=new BagDescriptionPage(driver);
		boolean itemispresent = bdp.VerifyItemispresent();
		if(itemispresent) {
			Assert.assertTrue(true);
			System.out.println("item is present in the bag ");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("item is not present in the bag ");
		}
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void To_verify_product_is_removingTest() throws InterruptedException {
		BagDescriptionPage bdp=new BagDescriptionPage(driver);
		bdp.toRemoveItem();
		Thread.sleep(2000);
		boolean itemispresent = bdp.VerifyItemispresent();
		if(itemispresent) {
			Assert.assertTrue(false);
			System.out.println("item is not removed from the bag successfully");
		}
		else {
			Assert.assertTrue(true);
			System.out.println("item is removed from the bag successfully");
		}
		Thread.sleep(4000);
		bdp.clickOnContinueShopping();
		System.out.println("clicked on continue shopping button");
	}
	
	
	@Test(priority=4)
	public void LogoutTest() throws InterruptedException {
		
		Thread.sleep(2000);
		ProductListPage plp=new ProductListPage(driver);
		plp.ClickOnDropdown();
		System.out.println("clicked on the logout from dropdown");
	}
	
}
