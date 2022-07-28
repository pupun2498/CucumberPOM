package StepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import Base.TestBase;
import Pages.HomePage;
import Pages.SearchResultPage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingStepDefinition extends TestBase {
	
	HomePage obj;
	SearchResultPage obj1;
	@Given("User is on Homepage")
	public void user_is_on_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    initialize();
	    obj  = new HomePage();
	    Assert.assertEquals(obj.homePageTitle(), "Your Store");
	}
	@When("User search an {string}")
	public void user_search_an_item(String searchItem) {
	    // Write code here that turns the phrase above into concrete actions
	    obj.searchProduct(searchItem);
	}
	@Then("should display search item results")
	public void should_display_search_item_results() {
	    // Write code here that turns the phrase above into concrete actions
	    obj1 = new SearchResultPage();
	    Assert.assertTrue(obj1.getHeading());
	}
	
	@When("User add item to cart")
	public void user_add_item_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("scroll(0,400)");
	    obj1 = new SearchResultPage();
		obj1.addItemtoCart();
	}
	@Then("Item must be available in cart")
	public void item_must_be_available_in_cart() {
	    // Write code here that turns the phrase above into concrete actions
		obj1= new SearchResultPage();
	    obj1.cartIconMethod();
	    Assert.assertTrue(obj1.finalCartIconMethod());
	}
	
	@AfterAll()
	public static void tearDown() {
		driver.close();
	}
	
}
