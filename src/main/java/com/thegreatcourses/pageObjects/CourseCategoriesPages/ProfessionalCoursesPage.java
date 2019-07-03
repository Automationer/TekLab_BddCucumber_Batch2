package com.thegreatcourses.pageObjects.CourseCategoriesPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.thegreatcourses.base.BasePage.getDriver;

public class ProfessionalCoursesPage {

    public ProfessionalCoursesPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(css = "[alt='Understanding Investments']")
    private WebElement underStandingInvestments_CourseLink;

    public static ProfessionalCoursesPage instantiate() {
        return new ProfessionalCoursesPage();
    }

    public WebElement getUnderStandingInvestments_CourseLink() {
        return underStandingInvestments_CourseLink;
    }
}
