package pages.shoppage;

import model.PayingFormBody;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

public abstract class ShopPage extends BasePage {

    /**
     * Constructor for BasePage.
     * Initializes WebDriver, WebDriverWait, and JavaScriptExecutorHelper.
     *
     * @param driver WebDriver instance to be used
     */
    public ShopPage(WebDriver driver) {
        super(driver);
    }

    private final By productNameList= By.cssSelector("h2[class='woocommerce-loop-product__title']");
    private final By productQuantityInput= By.cssSelector("[name=\"quantity\"]");
    private final By addToCardProduct = By.cssSelector("[name=\"add-to-cart\"]");
    private final By viewCardButton=By.cssSelector("a[class=\"button wc-forward\"]");
    private final By updateCardButton=By.cssSelector("[name=\"update_cart\"]");
    private final By quantityTotal=By.cssSelector("[aria-label=\"Product quantity\"]");
    private final By proocedToCheckoutButton=By.cssSelector("[class=\"checkout-button button alt wc-forward\"]");
    private final By firstNameInput= By.id("billing_first_name");
    private final By lastNameInput=By.id("billing_last_name");
    private final By companyNameInput=By.id("billing_company");
    private final By townCityInput=By.id("billing_city");
    private final By streetAdresInput= By.id("billing_address_1");
    private final By apartmentInput=By.id("billing_address_2");
    private final By postCode =By.id("billing_postcode");
    private final By phoneInput=By.id("billing_phone");
    private final By emailAdress=By.id("billing_email");
    private final By bankTransferPaymnetMethod= By.cssSelector("[for=\"payment_method_wallee_22\"]");
    private final By placeOrderButton =By.id("place_order");
    private final By warningCheckTermConditionsText= By.xpath("//li[contains(text(), 'terms and conditions')]");


    public void clickProductWithName(String productName){
        List<WebElement> productNames=driver.findElements(productNameList);
        for (WebElement product: productNames){
            if (product.getText().equalsIgnoreCase(productName.toLowerCase())){
                clickWithJS(product);
            }
        }
    }

    public void enterQuantityofProduct(int productQuantity){
        sendKeys(productQuantityInput,Integer.toString(productQuantity));
    }

    public void clickAddtoCardButton(){
        clickWithJS(addToCardProduct);
    }

    public void clickViewCartButton(){
        clickWithJS(viewCardButton);
    }
    public void clickUpdateCardButton(){
        clickWithJS(updateCardButton);
    }

    public void setQuantityProductInput(int quantity){
        sendKeys(quantityTotal,Integer.toString(quantity));
    }

    public void clickProcedToCheckoutButton(){
        clickWithJS(proocedToCheckoutButton);
    }

    public void setPayingForm(PayingFormBody user){
        sendKeysWithJS(driver.findElement(firstNameInput), user.getFirstName());
        sendKeysWithJS(driver.findElement(lastNameInput), user.getLastName());
        sendKeysWithJS(driver.findElement(companyNameInput), user.getCompanyName());
        sendKeysWithJS(driver.findElement(townCityInput), user.getTownCity());
        sendKeysWithJS(driver.findElement(streetAdresInput), user.getStreetAdress());
        sendKeysWithJS(driver.findElement(apartmentInput), user.getApartmen());
        sendKeysWithJS(driver.findElement(postCode), user.getPostCode());
        sendKeysWithJS(driver.findElement(phoneInput), user.getPhone());
        sendKeysWithJS(driver.findElement(emailAdress), user.getEmailAddres());
    }
    public void clickBankTransferAsPaymentMethod(){
        clickWithJS(bankTransferPaymnetMethod);
    }
    public void clickPlaceOrderButton(){
        clickWithJS(placeOrderButton);
    }
    public boolean isDisplayedTermConditionsWarn(){
        return  driver.findElement(warningCheckTermConditionsText).isDisplayed();
    }
}
