package stepDefinitions.Footer_StepDef;

import com.thegreatcourses.pageObjects.FooterPages.FooterContainerSection;
import com.thegreatcourses.utility.VerifyLinks;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;

public class FooterContainer_StepDef {

    private FooterContainerSection footerContainerSection = new FooterContainerSection();
    private VerifyLinks verifyLink;

    public FooterContainer_StepDef() {
        verifyLink = new VerifyLinks();
    }


    @Then("^All course category links in footer container should work properly$")
    public void all_course_category_links_in_footer_container_should_work_properly() {

        for (WebElement temp : footerContainerSection.getCourseCategoryLinks_footerContainer())
            verifyLink.verify(temp.getAttribute("href"));

    }

    @Then("^All More links in footer container should work properly$")
    public void all_More_links_in_footer_container_should_work_properly() {

        for (WebElement temp : footerContainerSection.getMoreLinks_footerContainer())
            verifyLink.verify(temp.getAttribute("href"));

    }

    @Then("^All Help links in footer container should work properly$")
    public void all_Help_links_in_footer_container_should_work_properly() {
        for (WebElement temp : footerContainerSection.getHelpLinks_footerContainer())
            verifyLink.verify(temp.getAttribute("href"));
    }

    @Then("^All footer container links should work properly$")
    public void all_footer_container_links_should_work_properly() {

        for (WebElement temp : footerContainerSection.getCourseCategoryLinks_footerContainer())
            verifyLink.verify(temp.getAttribute("href"));
        for (WebElement temp : footerContainerSection.getMoreLinks_footerContainer())
            verifyLink.verify(temp.getAttribute("href"));
        for (WebElement temp : footerContainerSection.getHelpLinks_footerContainer())
            verifyLink.verify(temp.getAttribute("href"));

    }

}
