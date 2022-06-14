package org.example.steps.serenity;


import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;

public class EndUserSteps {
    LoginPage loginPage;
    HomePage homePage;

    @Step
    public void is_in_the_login_page(){loginPage.open();};

    @Step
    public void enters_username(String username){loginPage.enter_username(username);}

    @Step
    public void enters_password(String password){loginPage.enter_password(password);}

    @Step
    public void clicks_login_button(){loginPage.click_login_button();}

    @Step
    public void should_read_home_title(){
        Assert.assertEquals(homePage.read_title(), "MY ACCOUNT");}

}
