package StepDefintion;

import PageObject.CheckOutPage;
import PageObject.LoginPage;
import TestContextInfo.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOutStepDefinition {
	
	 TestContext testContext;
	    CheckOutPage checkOutPage;

	    
	    public CheckOutStepDefinition(TestContext context) {
	        this.testContext = context;
	        this.checkOutPage = testContext.getPageObjectManager().getCheckOutPage();
	    }
	
	@When("I add multiple products to the cart")
	public void i_add_multiple_products_to_the_cart() {
		checkOutPage.SelectingProduct();
	}

	@And("I proceed to checkout")
	public void i_proceed_to_checkout() {
		checkOutPage.clickonCart();
		checkOutPage.proceedtocheckout();
	}

	@Then("I should complete the checkout journey successfully")
	public void i_should_complete_the_checkout_journey_successfully() {
		checkOutPage.CheckoutCompleted();
	}
}
