package steps;

import io.cucumber.java.en.*;
import model.PayingFormBody;
import org.junit.Assert;
import utilities.faker.TestDataGeneratorFactory;
import utilities.resources.DeutschUrlResources;
import utilities.resources.EnglishUrlResources;

public class ShopSteps extends BaseSteps{
    PayingFormBody payingFormBody;
    @Given("^the user navigates to homePage$")
    public void theUserNavigatesToHomePage() {
        pageManager.shopPageEng.navigateToHomePage(new EnglishUrlResources());
    }

    @When("the user clicks the {string} button below the product named {string}")
    public void theUserClicksTheButtonBelowTheProductNamed(String arg0, String productName) {
        pageManager.shopPageEng.clickProductWithName(productName);
    }


    @And("the user clicks on the {string} link")
    public void theUserClicksOnTheLink(String arg0) {
        pageManager.shopPageEng.clickViewCartButton();
    }

    @And("the user click add to card button")
    public void theUserClickAddToCardButton() {
        pageManager.shopPageEng.clickAddtoCardButton();
    }

    @And("the user sets the product quantity to {int}")
    public void theUserSetsTheProductQuantityTo(int quantity) throws InterruptedException {
        pageManager.shopPageEng.enterQuantityofProduct(quantity);
    }


    @And("the user sets the product quantity to {int} on the Card")
    public void theUserSetsTheProductQuantityToOnTheCard(int quantity) {
        pageManager.shopPageEng.setQuantityProductInput(quantity);
    }

    @And("the user clicks the {string} button")
    public void theUserClicksTheButton(String arg0) {
        pageManager.shopPageEng.clickUpdateCardButton();
    }

    @When("the user clicks the for paying {string} button")
    public void theUserClicksTheForPayingButton(String arg0) {
        pageManager.shopPageEng.clickProcedToCheckoutButton();
    }

    @And("the user fills in all required billing details")
    public void theUserFillsInAllRequiredBillingDetails() {
        payingFormBody= new PayingFormBody();
        payingFormBody.setFirstName(TestDataGeneratorFactory.getGenerator().generateFirstName());
        payingFormBody.setLastName(TestDataGeneratorFactory.getGenerator().generateLastName());
        payingFormBody.setTownCity(TestDataGeneratorFactory.getGenerator().generateCity());
        payingFormBody.setStreetAdress(TestDataGeneratorFactory.getGenerator().generateStreetAddress());
        payingFormBody.setPostCode(TestDataGeneratorFactory.getGenerator().generateZipCode());
        payingFormBody.setPhone(TestDataGeneratorFactory.getGenerator().generatePhoneNumber());
        payingFormBody.setEmailAddres(TestDataGeneratorFactory.getGenerator().generateEmail());
        pageManager.shopPageEng.setPayingForm(payingFormBody);
    }

    @And("selects {string} as the payment option")
    public void selectsAsThePaymentOption(String arg0) {
        pageManager.shopPageEng.clickBankTransferAsPaymentMethod();
    }

    @And("clicks the {string} button")
    public void clicksTheButton(String arg0) {
        pageManager.shopPageEng.clickPlaceOrderButton();
    }

    @Then("a warning message should appear stating that the terms and conditions checkbox must be checked")
    public void aWarningMessageShouldAppearStatingThatTheTermsAndConditionsCheckboxMustBeChecked() {
        Assert.assertTrue(pageManager.shopPageEng.isDisplayedTermConditionsWarn());
    }

    @Given("the user navigates to homePage \\(deutsch)")
    public void theUserNavigatesToHomePageDeutsch() {
        pageManager.shopPageDe.navigateToHomePage(new DeutschUrlResources());
    }

    @Then("a warning message should appear stating that the terms and conditions checkbox must be checked \\(deutsch)")
    public void aWarningMessageShouldAppearStatingThatTheTermsAndConditionsCheckboxMustBeCheckedDeutsch() {
        Assert.assertTrue(pageManager.shopPageDe.isDisplayedTermConditionsWarn());
    }
}
