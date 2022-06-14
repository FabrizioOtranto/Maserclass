package org.example.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("http://automationpractice.com/index.php?")
public class HomePage extends PageObject {
    @FindBy(className = "page-heading")
    private WebElementFacade title;

    public String read_title(){
        return title.getText();
    }


}