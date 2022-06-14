package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends  BasePage{
    By usernameInput = By.id("email");
    By passwordInput = By.id("passwd");
    By logInButton = By.id("SubmitLogin");

    public LoginPage(){
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    public void LogIn(String username,String password){
        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(logInButton).click();

    }



}
