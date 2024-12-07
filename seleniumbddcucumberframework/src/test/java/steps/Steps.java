package steps;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DemoBlazeHomePage;
import pages.DemoBlazeLoginPage;
import utility.BrowserUtil;

//Added new comments
public class Steps {
	RemoteWebDriver driver;
	
	@Given("User opened the browser")
	public void user_opened_the_browser() {
	   driver=BrowserUtil.getDriver();
	}

	@When("user navigated to the DemoBlaze application login URL")
	public void user_navigated_to_the_demo_blaze_application_login_url() {
	   driver.navigate().to("https://www.demoblaze.com/index.html"); 
	}

	@When("user clicks on Sign-in link")
	public void user_clicks_on_sign_in_link() {
	   DemoBlazeHomePage homePage=new DemoBlazeHomePage(driver);
	   homePage.clickOnLoginLink();
	}

	@When("user input user name as {string} and password as {string}")
	public void user_input_user_name_as_and_password_as(String userName, String password) {
	   DemoBlazeLoginPage loginPage=new DemoBlazeLoginPage(driver);
	   loginPage.setUserName(userName);
	   loginPage.setPassword(password);
	 
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		DemoBlazeLoginPage loginPage=new DemoBlazeLoginPage(driver);
		loginPage.clickLoginButton();
	}

	@Then("user should see home page with greeting message")
	public void user_should_see_home_page_with_greeting_message() {
		DemoBlazeHomePage homePage=new DemoBlazeHomePage(driver);
		boolean flag=homePage.isLogoutLinkDisplayed();
		Assert.assertEquals(flag, true);
	}
	
	@And("close the browser")
	public void closeBrowser() {
		driver.quit();
	}
	
	@Then("user should see error message")
	public void verifyErrorMessageDisplayed() {
		DemoBlazeLoginPage loginPage=new DemoBlazeLoginPage(driver);
		boolean isAlertDisplayed=loginPage.isAlertPresent();
		Assert.assertEquals(isAlertDisplayed, true);
	}
//	@When("user input user name as {string} and password as {string}")
//	public void someting(St)

}
