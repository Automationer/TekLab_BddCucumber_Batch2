package com.thegreatcourses.pageObjects.CommonPages;

import com.thegreatcourses.utility.*;
import com.thegreatcourses.utility.components.Dropdown;
import com.thegreatcourses.utility.components.Frame;
import com.thegreatcourses.utility.components.TextField;
import com.thegreatcourses.utility.components.WebButton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.thegreatcourses.base.BasePage.getDriver;

public class CheckOutPage {

    public CheckOutPage() {
        PageFactory.initElements(getDriver(), this);
    }

    private Commons commons = new Commons();
    private WebButton clickAt = new WebButton();
    private TextField typeIn = new TextField();
    private Dropdown drop = new Dropdown();
    private Frame frame = new Frame();


    @FindBy(id = "login-email")
    private WebElement emailAddress;

    @FindBy(css = "[for='no_have_pass']")
    private WebElement newCustomer_radioBtn;

    @FindBy(id = "checkout-sigin")
    private WebElement continue_btn_1;

    @FindBy(id = "billing:firstname")
    private WebElement firstName_textBox;

    @FindBy(id = "billing:lastname")
    private WebElement lastName_textBox;

    @FindBy(id = "billing:company")
    private WebElement company_textBox;

    @FindBy(id = "billing:street1")
    private WebElement street1_textBox;

    @FindBy(id = "billing:street2")
    private WebElement street2_textBox;

    @FindBy(id = "billing:city")
    private WebElement city_textBox;

    @FindBy(id = "billing:region_id")
    private WebElement state_dropDown;

    @FindBy(id = "billing:postcode")
    private WebElement zipCode_textBox;

    @FindBy(id = "billing:telephone")
    private WebElement telephone_textBox;

    @FindBy(id = "billing:fax")
    private WebElement fax_textBox;

    @FindBy(id = "billing:customer_password")
    private WebElement password_textBox;

    @FindBy(id = "billing:confirm_password")
    private WebElement confirmPassword_textBox;

    @FindBy(css = "#billing-buttons-container button")
    private WebElement continue_btn_2;

    @FindBy(css = "[for='s_method_productmatrix_Overnight_Express']")
    private WebElement overnightExpress_radioBtn;

    @FindBy(css = "#shipping-method-buttons-container button")
    private WebElement continue_btn_3;

    @FindBy(css = "input[placeholder='Credit Card Number']")
    private WebElement cardNumber_textBox;

    @FindBy(name = "expMonth")
    private WebElement month_dropDown;

    @FindBy(name = "expYear")
    private WebElement year_dropDown;

    @FindBy(css = "input[placeholder='CVV']")
    private WebElement securityCode_textBox;

    @FindBy(css = "#payment-buttons-container button")
    private WebElement Continue_btn_4;

    @FindBy(css = "[for='accept_terms']")
    private WebElement acceptTerms_checkbox;

    @FindBy(id = "checkout-submit")
    private WebElement placeOrder_btn;

    @FindBy(id = "vantiv-payframe")
    private WebElement iframe_element;

    public void fillOut() {

        typeIn.$(emailAddress, "teklab@gmail.com");

        clickAt
                .$(newCustomer_radioBtn)
                .$(continue_btn_1);

        typeIn
                .$(firstName_textBox, "Jack")
                .$(lastName_textBox, "Jenkins")
                .$(company_textBox, "Apple")
                .$(street1_textBox, "123 main street")
                .$(street2_textBox, "apt 311")
                .$(city_textBox, "fairfax");

        drop.$(state_dropDown).selectByValue("61");

        typeIn
                .$(zipCode_textBox, "45345")
                .$(telephone_textBox, "2131131445")
                .$(fax_textBox, "2343211")
                .$(password_textBox, "1233222")
                .$(confirmPassword_textBox, "1233222");

        clickAt
                .$(continue_btn_2)
                .$(overnightExpress_radioBtn)
                .$(continue_btn_3);
    }

    public void placeOrder() {
        frame.switchToIFrame(iframe_element);
        typeIn.$(cardNumber_textBox, "5555555555554444");
        drop.$(month_dropDown).selectByValue("07");
        drop.$(year_dropDown).selectByValue("21");
        typeIn.$(securityCode_textBox, "324");
        frame.switchBackToDefault();
        clickAt.$(Continue_btn_4);
        commons.waitAbit(2);
        clickAt.$(acceptTerms_checkbox);
        commons.waitAbit(1);
        clickAt.$(placeOrder_btn);
    }

}









