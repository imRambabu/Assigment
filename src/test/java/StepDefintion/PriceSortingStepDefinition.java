package StepDefintion;

import PageObject.LoginPage;
import PageObject.PriceSortingPage;
import TestContextInfo.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PriceSortingStepDefinition {
	LoginPage loginPage;
	TestContext testContext;
	PriceSortingPage priceSortingPage;

	public PriceSortingStepDefinition(TestContext context) {
		this.testContext = context;
		this.priceSortingPage = testContext.getPageObjectManager().getPriceSortingPage();
	}

	@When("I sort the products by Price {string}")
	public void i_sort_the_products_by_price(String price) {
		priceSortingPage.verifyPriceSorting(price);
	}

	@Then("I should see products sorted by descending price")
	public void i_should_see_products_sorted_by_descending_price() {
		priceSortingPage.DesendingPrice();
	}
}
