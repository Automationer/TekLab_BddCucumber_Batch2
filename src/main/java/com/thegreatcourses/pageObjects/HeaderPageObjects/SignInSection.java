package com.thegreatcourses.pageObjects.HeaderPageObjects;

import com.thegreatcourses.base.BasePage;
import com.thegreatcourses.utility.Commons;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInSection extends BasePage {


    public SignInSection() {
        PageFactory.initElements(getDriver(), this);
    }

    public static SignInSection instantiate() {
        return new SignInSection();
    }

    private Commons commons = new Commons();

    @FindBy(css = "#email")
    WebElement email_textBox;

    @FindBy(css = "#pass")
    WebElement password_textBox;

    @FindBy(xpath = "//a[@title='Account name']")
    WebElement accountName;

    public void signIn(String email, String password) {
        commons.login(email_textBox, password_textBox, Keys.ENTER, email, password);
    }

    public WebElement getAccountName() {
        return accountName;
    }
}
