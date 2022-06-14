package pages;

import utility.PropertiesFile;

public class TransporterPage extends  BasePage{
    String url = PropertiesFile.getProperty("loginUrl");

    public TransporterPage(){
        this.driver = getDriver();

    }

    public void goLoggin(){
        driver.get(url);
    }

}
