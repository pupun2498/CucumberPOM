package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePage extends TestBase{
	
	//page factory pattern
	@FindBy(name="search")
	WebElement searchBox;
	
	//PageFactory
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Search Product
	public void searchProduct(String product) {
		searchBox.sendKeys(product);
		searchBox.submit();
	}
	
	public String homePageTitle() {
		return driver.getTitle();
	}
}
