package stepDefinitions;

import com.thegreatcourses.pageObjects.HomePage;
import com.thegreatcourses.utility.Commons;
import com.thegreatcourses.utility.components.SeleniumWaits;
import com.thegreatcourses.utility.components.TextField;
import com.thegreatcourses.utility.components.WebButton;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.thegreatcourses.base.BasePage.getDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class HomePage_StepDef {

    private HomePage homePage = new HomePage();
    private Commons commons = new Commons();
    private WebButton clickAt = new WebButton();
    private TextField typeIn = new TextField();
    private SeleniumWaits seleniumWaits = new SeleniumWaits();

    @Given("^User is on home page$")
    public void user_is_on_home_page() {

    }

    @Given("^User goes to the Application$")
    public void user_goes_to_the_Application() {

    }

    @Then("^Correct phone number should be displayed$")
    public void correct_phone_number_should_be_displayed() {
        String number = homePage.getContactNumber().getText().trim();
        assertThat(number).isEqualTo("1-800-832-2412");
    }

    @When("^Searches for \"([^\"]*)\" course$")
    public void searches_for_course(String arg1) {
        homePage.getSearch_inputBox().sendKeys(arg1);
        clickAt.$(homePage.getSearch_btn());
    }

    @And("^Go to My Digital Library$")
    public void go_to_My_Digital_Library() {
        clickAt.$(homePage.getMyDigitalLibrary_btn());
    }

    @Then("^Go to Wish List$")
    public void go_to_Wish_List() {
        clickAt.$(homePage.getWishList_btn());
    }

    @When("^Clicks on Have a priority code link$")
    public void clicks_on_Have_a_priority_code_link() {
        clickAt.$(homePage.getPriorityCodePopup_link());
    }

    @Then("^Popup window should be displayed$")
    public void popup_window_should_be_displayed() {
        commons.verifyHeader("Priority Code", homePage.getPriorityCodePopup_header());
        clickAt.$(homePage.getClose_icon());
    }

    @When("^Enter bad priority code \"([^\"]*)\"$")
    public void enter_bad_priority_code(String arg1) {
        typeIn.$(homePage.getPriorityCode_textbox(), arg1);
        clickAt.$(homePage.getApply_btn());
    }

    @Then("^System should throw error message$")
    public void system_should_throw_error_message() {
        seleniumWaits.waitUntilTextToBePresent(homePage.getPriorityCode_errorMsg(), "Priority Code is not valid");
        String errorMsg = homePage.getPriorityCode_errorMsg().getText();
        commons.verifyText("Priority Code is not valid", errorMsg);
    }

    @When("^Clicks on About us$")
    public void clicks_on_About_us() {
        String originalTab = getDriver().getWindowHandle();
        clickAt.$(homePage.getAboutUs_link());
        commons.switchToNewTab(originalTab);
    }

    @Then("^About us page should open on a new tab$")
    public void about_us_page_should_open_on_a_new_tab() {
        commons.verifyWithTitle("About The Great Courses");
    }

    @Given("^Choose a bestseller course$")
    public void choose_a_bestseller_course() {
        clickAt.$(homePage.getBestSellerCourse());
    }


}
