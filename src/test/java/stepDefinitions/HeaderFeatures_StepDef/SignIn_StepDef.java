package stepDefinitions.HeaderFeatures_StepDef;

import com.thegreatcourses.pageObjects.HeaderPageObjects.SignInSection;
import com.thegreatcourses.pageObjects.HomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class SignIn_StepDef {

    private HomePage homePage = new HomePage();
    private SignInSection signInSection = new SignInSection();

    @When("^Enter valid username and password$")
    public void enter_valid_username_and_password() {
        homePage
                .clickOnSignIn()
                .signIn("dibor@geo-crypto.com", "ilovecoding");
    }

    @Then("^Should be able to sign in$")
    public void should_be_able_to_sign_in() {
        String accountName = signInSection.getAccountName().getText().trim();
        assertThat(accountName).isEqualTo("Ilzat Abdusamat");
    }

}
