package com.thegreatcourses.pageObjects.HeaderPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.thegreatcourses.base.BasePage.getDriver;

public class ShoppingCartPage {

    @FindBy(xpath = "(//span[text()='Checkout Now'])[2]")
    WebElement checkout_btn;

    public ShoppingCartPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebElement getCheckout_btn() {
        return checkout_btn;
    }
}
