package stepDefinitions.CommonActivities_StepDef;

import com.thegreatcourses.pageObjects.CommonPages.CheckOutPage;
import com.thegreatcourses.pageObjects.CommonPages.ChooseCourseFormatPage;
import com.thegreatcourses.pageObjects.HeaderPageObjects.InitialCartPage;
import com.thegreatcourses.utility.AlertImp;
import com.thegreatcourses.utility.components.SeleniumWaits;
import com.thegreatcourses.utility.components.WebButton;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class PlaceOrder_StepDef {

    private ChooseCourseFormatPage chooseCourseFormatPage = new ChooseCourseFormatPage();
    private InitialCartPage initialCartPage = new InitialCartPage();
    private CheckOutPage checkOutPage = new CheckOutPage();
    private WebButton clickAt = new WebButton();
    private AlertImp alert = new AlertImp();
    private SeleniumWaits seleniumWaits = new SeleniumWaits();

    @Given("^Add to the shopping cart$")
    public void add_to_the_shopping_cart() {
        chooseCourseFormatPage.chooseCourseFormat("dvd");
        clickAt.$(chooseCourseFormatPage.getAddToCart_btn());
    }

    @Given("^Go to Checkout page$")
    public void go_to_Checkout_page() {
        clickAt.$(initialCartPage.getProceedToCheckout_btn());
    }

    @Then("^Create new billing address$")
    public void create_new_billing_address() {
        checkOutPage.fillOut();
    }

    @When("^Place the order$")
    public void place_the_order() {
        checkOutPage.placeOrder();
    }

    @Then("^Order should be successfully placed$")
    public void order_should_be_successfully_placed() {
        String alertText = seleniumWaits.waitUntilAlert().getText();
        alert.accept();
        assertThat(alertText).contains("1-844-325-7820");
    }

}
