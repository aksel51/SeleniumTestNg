package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Allure2youPage {
    public Allure2youPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



}
