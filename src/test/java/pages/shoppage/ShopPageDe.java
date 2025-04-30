package pages.shoppage;

import model.PayingFormBody;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

public class ShopPageDe extends ShopPage {

    /**
     * Constructor for BasePage.
     * Initializes WebDriver, WebDriverWait, and JavaScriptExecutorHelper.
     *
     * @param driver WebDriver instance to be used
     */
    public ShopPageDe(WebDriver driver) {
        super(driver);
    }


    private final By warningCheckTermConditionsText= By.xpath("//li[contains(text(), 'Bitte lesen und akzeptieren')]");

    @Override
    public boolean isDisplayedTermConditionsWarn(){
        return  driver.findElement(warningCheckTermConditionsText).isDisplayed();
    }
}
