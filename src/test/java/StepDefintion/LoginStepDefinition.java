package StepDefintion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import TestContextInfo.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	 TestContext testContext;
	    LoginPage loginPage;

	    
	    public LoginStepDefinition(TestContext context) {
	        this.testContext = context;
	        this.loginPage = testContext.getPageObjectManager().getLoginPage();
	    }
	@Given("user on login page")
	public void user_on_login_page() {
		
		loginPage.navigateto_LoginPage();
		
		
	}
	@When("user enter the valid {string} and {string}")
	public void user_enter_the_valid_and(String username, String password) {

		
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);

		
	}

	@And("click on login button")
	public void click_on_login_button() {
		loginPage.clickLogin();
		
	}

	@Then("user on Home Page")
	public void user_on_home_page() {
		loginPage.islogDisplayed();
		
	}

}
