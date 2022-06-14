package org.example.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class LoginPage extends PageObject {
    @FindBy(id = "email")
    WebElementFacade usernameInput;
    @FindBy(id = "passwd")
    WebElementFacade passwordInput;
    @FindBy(id = "SubmitLogin")
    WebElementFacade logInButton;


    public void enter_username(String username){usernameInput.sendKeys(username);}

    public void enter_password(String password){passwordInput.sendKeys(password);}

    public void click_login_button(){logInButton.click();}



}
