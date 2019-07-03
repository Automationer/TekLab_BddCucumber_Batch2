package com.thegreatcourses.utility;

import static com.thegreatcourses.base.BasePage.getDriver;

public class AlertImp implements IAlert<AlertImp> {

    @Override
    public AlertImp accept() {
        getDriver().switchTo().alert().accept();
        return self();
    }

    @Override
    public AlertImp cancel() {
        getDriver().switchTo().alert().dismiss();
        return self();
    }

    @Override
    public String getText() {
        return getDriver().switchTo().alert().getText();
    }

    private AlertImp self() {
        return this;
    }

}
