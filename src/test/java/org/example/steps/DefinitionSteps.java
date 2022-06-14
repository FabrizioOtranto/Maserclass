package org.example.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import org.example.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the login page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        endUser.is_in_the_login_page();
    }

    @When("the user enters valid username '$username' and password '$password'")
    public void whenTheUserLooksUpTheDefinitionOf(String username, String password) {
        endUser.enters_username(username);
        endUser.enters_password(password);
        endUser.clicks_login_button();
    }

    @Then("the user is redirected to home page")
    public void thenTheyShouldSeeTheHomeTitle() {
        endUser.should_read_home_title();
    }
}
