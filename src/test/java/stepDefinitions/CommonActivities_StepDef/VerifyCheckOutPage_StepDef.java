package stepDefinitions.CommonActivities_StepDef;

import com.thegreatcourses.pageObjects.CommonPages.ChooseCourseFormatPage;
import com.thegreatcourses.pageObjects.HeaderPageObjects.InitialCartPage;
import com.thegreatcourses.pageObjects.HeaderPageObjects.ShoppingCartPage;
import com.thegreatcourses.pageObjects.HomePage;
import com.thegreatcourses.utility.Commons;
import com.thegreatcourses.utility.components.WebButton;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyCheckOutPage_StepDef {

    private HomePage homePage = new HomePage();
    private ChooseCourseFormatPage chooseCourseFormatPage = new ChooseCourseFormatPage();
    private InitialCartPage initialCartPage = new InitialCartPage();
    private ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    private Commons commons = new Commons();
    private WebButton clickAt = new WebButton();

    @When("^User adds an item to the cart$")
    public void user_adds_an_item_to_the_cart() {

        clickAt.$(
                homePage
                        .goto_ProfessionalCoursesPage()
                        .getUnderStandingInvestments_CourseLink()
        );

        chooseCourseFormatPage
                .chooseCourseFormat("dvd")
                .getAddToCart_btn()
                .click();

        clickAt.$(commons.waitUntilClickable(initialCartPage.getCart_btn()));

        clickAt.$(shoppingCartPage
                .getCheckout_btn()
        );
    }

    @Then("^User can go to Checkout page$")
    public void user_can_go_to_Checkout_page() {
        commons.verifyWithTitle("Checkout");
    }

}
