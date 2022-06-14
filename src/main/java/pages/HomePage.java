package pages;

import org.openqa.selenium.By;


public class HomePage extends BasePage{
    By title = By.className("page-heading");

    public HomePage(){
        this.driver = getDriver();
    }

    public String readTitle(){
        return driver.findElement(title).getText();
    }


}