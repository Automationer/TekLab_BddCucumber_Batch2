package com.thegreatcourses.pageObjects;

import com.thegreatcourses.pageObjects.CourseCategoriesPages.ProfessionalCoursesPage;
import com.thegreatcourses.pageObjects.HeaderPageObjects.SignInSection;
import com.thegreatcourses.utility.Commons;
import com.thegreatcourses.utility.components.SeleniumWaits;
import com.thegreatcourses.utility.components.WebButton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.thegreatcourses.base.BasePage.getDriver;


public class HomePage {

    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    private WebButton clickAt = new WebButton();
    private SeleniumWaits seleniumWaits = new SeleniumWaits();

    @FindBy(xpath = "(//a[contains(text(),'Sign In')])[2]")
    private WebElement signIn_btn;

    @FindBy(css = ".f-right-h-list li.first")
    private WebElement contactNumber;

    @FindBy(xpath = "(//a[@class='next'])[2]")
    private WebElement rightArrow_sign;

    @FindBy(css = "[alt='Professional']:nth-child(1)") // "[alt='Professional']:nth-child(1)"
    private WebElement professionalCourses;

    @FindBy(css = "[id='search']")
    private WebElement search_inputBox;

    @FindBy(xpath = "(//span[text()='Search'])[2]")
    private WebElement search_btn;

    @FindBy(xpath = "//a[text()='My digital library']")
    private WebElement myDigitalLibrary_btn;

    @FindBy(xpath = "//a[text()='Wish list']")
    private WebElement wishList_btn;

    @FindBy(xpath = "//a[text()='Have a Priority Code?']")
    private WebElement priorityCodePopup_link;

    @FindBy(xpath = "//h4[text()='Priority Code']")
    private WebElement priorityCodePopup_header;

    @FindBy(xpath = "(//a[@class='close-balloon'][contains(text(),'x')])[3]")
    private WebElement close_icon;

    @FindBy(css = "[placeholder='Enter Priority Code']")
    private WebElement priorityCode_textbox;

    @FindBy(css = "form#priority-code button span span")
    private WebElement apply_btn;

    @FindBy(css = "form#priority-code div")
    private WebElement priorityCode_errorMsg;

    @FindBy(xpath = "//ul[@class='f-right-h-list']/li/a")
    private WebElement aboutUs_link;

    @FindBy(css = "a[title='Fundamentals of Photography']")
    private WebElement bestSellerCourse;

    public SignInSection clickOnSignIn() {
        clickAt.$(signIn_btn);
        return SignInSection.instantiate();
    }

    public WebElement getContactNumber() {
        return contactNumber;
    }

    public WebElement getSearch_inputBox() {
        return search_inputBox;
    }

    public WebElement getSearch_btn() {
        return search_btn;
    }

    public WebElement getMyDigitalLibrary_btn() {
        return myDigitalLibrary_btn;
    }

    public WebElement getWishList_btn() {
        return wishList_btn;
    }

    public WebElement getPriorityCodePopup_link() {
        return priorityCodePopup_link;
    }

    public WebElement getPriorityCodePopup_header() {
        return priorityCodePopup_header;
    }

    public WebElement getClose_icon() {
        return close_icon;
    }

    public WebElement getPriorityCode_textbox() {
        return priorityCode_textbox;
    }

    public WebElement getApply_btn() {
        return apply_btn;
    }

    public WebElement getPriorityCode_errorMsg() {
        return priorityCode_errorMsg;
    }

    public WebElement getAboutUs_link() {
        return aboutUs_link;
    }

    public WebElement getBestSellerCourse() {
        return bestSellerCourse;
    }

    public ProfessionalCoursesPage goto_ProfessionalCoursesPage() {
        clickAt.$(rightArrow_sign);
        seleniumWaits.waitUntilVisible(professionalCourses);
        clickAt.$(professionalCourses);
        return ProfessionalCoursesPage.instantiate();
    }

}
