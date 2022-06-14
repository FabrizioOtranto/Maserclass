package pages;
import utility.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(){
        this.driver = DriverFactory.getDriver();

    }

    public WebDriver getDriver() {
        return driver;
    }



}
