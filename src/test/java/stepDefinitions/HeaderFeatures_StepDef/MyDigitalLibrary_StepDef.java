package stepDefinitions.HeaderFeatures_StepDef;

import com.thegreatcourses.pageObjects.HeaderPageObjects.MyDigitalLibraryPage;
import com.thegreatcourses.utility.Commons;
import com.thegreatcourses.utility.components.WebButton;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.stream.IntStream;

public class MyDigitalLibrary_StepDef {

    private Commons commons = new Commons();
    private MyDigitalLibraryPage myDigitalLibraryPage = new MyDigitalLibraryPage();
    private WebButton clickAt = new WebButton();

    @Then("^My Digital Library should open$")
    public void my_Digital_Library_should_open() {
        commons.verifyWithTitle("My Digital Library");
    }

    @Then("^Left side bar tabs should display correct pages$")
    public void left_side_bar_tabs_should_display_correct_pages() {
        IntStream.range(0, 6).forEachOrdered(i -> {
            clickAt.$(commons.findBy(myDigitalLibraryPage.getLeftNavBar()).findElements(By.tagName("li")).get(i));
            WebElement header = commons.findBy(myDigitalLibraryPage.getHeader());
            commons.verifyHeader(myDigitalLibraryPage.getHeaderMessages().get(i), header);
        });
    }
}