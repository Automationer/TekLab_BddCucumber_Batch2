package stepDefinitions.CommonActivities_StepDef;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static com.thegreatcourses.base.BasePage.getDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class Courses_StepDef {

    @Then("^System should find the searched course$")
    public void system_should_find_the_searched_course() {
        String professorName = getDriver()
                .findElement(By.cssSelector("[title='How to Program: Computer Science Concepts and Python Exercises'] span[class='professor-name']"))
                .getText();
        assertThat(professorName).isNotEmpty().isEqualTo("John Keyser");
    }

}
