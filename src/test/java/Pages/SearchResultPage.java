package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class SearchResultPage extends TestBase {
	
	@FindBy(xpath = "(//div[@class='product-thumb'])[1]")
	WebElement item;
	
	@FindBy(xpath = "//button[@class='btn btn-cart cart-34']")
	WebElement addItemCartBtn;
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void addItemtoCart() {
		Actions action = new Actions(driver);
		action.moveToElement(item).click(addItemCartBtn);
	}
	
	public boolean getHeading() {
		WebElement heading = driver.findElement(By.xpath("//img[@alt='Poco Electro']"));
		boolean strHeading = heading.isDisplayed();
		return strHeading;
	}
	
	public void cartIconMethod() {
		WebElement cartIcon = driver.findElement(By.xpath("(//div[@class='cart-icon'])[1]"));
		cartIcon.click();
		WebElement editCartIcon = driver.findElement(By.xpath("//div[@id='entry_217850']//a"));
		editCartIcon.click();
	}
	
	public boolean finalCartIconMethod() {
		WebElement finalCartIcon = driver.findElement(By.xpath("//img[@alt='Poco Electro']"));
		boolean finalCheck = finalCartIcon.isDisplayed();
		return finalCheck;
	}
	System.out.println("Edited in GITHUB")
}
