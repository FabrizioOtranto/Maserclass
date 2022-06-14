package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pages.HomePage;
import pages.LoginPage;
import pages.TransporterPage;
import utility.DriverFactory;

public class Steps {


    @Given("The user is in the login page of automationPractice")
    public void the_user_is_in_the_login_page_of_automationPractice() {
        TransporterPage transporterPage = new TransporterPage();
        transporterPage.goLoggin();
    }

    @When("The user enters valid username {string} and password {string}")
    public void the_user_enter_valid_credentials(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.LogIn(username, password);
    }

    @Then("The user is redirected to home page")
    public void the_user_should_be_taken_to_my_account() {
        HomePage homePage = new HomePage();
        Assert.assertEquals(homePage.readTitle(), "MY ACCOUNT");
    }

    @After()
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
