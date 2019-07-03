package com.thegreatcourses.pageObjects.HeaderPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.thegreatcourses.base.BasePage.getDriver;

public class InitialCartPage {

    public InitialCartPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(css = "[title='Proceed To Checkout']")
    private WebElement proceedToCheckout_btn;

    @FindBy(xpath = "(//a[contains(text(),'Cart')])[1]")
    private WebElement cart_btn;

    public WebElement getProceedToCheckout_btn() {
        return proceedToCheckout_btn;
    }

    public WebElement getCart_btn() {
        return cart_btn;
    }
}
