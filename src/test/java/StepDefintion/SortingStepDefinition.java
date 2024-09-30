package StepDefintion;

import org.openqa.selenium.WebDriver;

import PageObject.LoginPage;
import PageObject.SortingPage;
import TestContextInfo.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SortingStepDefinition {
	TestContext testContext;
	SortingPage sortingPage;

	public SortingStepDefinition(TestContext context) {
		this.testContext = context;
		this.sortingPage = testContext.getPageObjectManager().getSortingPage();
	}

	@When("user selects the {string} sorting option")
	public void user_selects_the_sorting_option(String sortOrder) {

		sortingPage.VerifySorting(sortOrder);

	}

	@Then("the items should be displayed in descending alphabetical order")
	public void the_items_should_be_displayed_in_descending_alphabetical_order() {
		sortingPage.DesendingName();
	}

}
