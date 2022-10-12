package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class pearlymarketPage {
    public pearlymarketPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
