package com.bullis.uiTest.testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage{
    public LogInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="input#username")
    public WebElement usernameInputField;

    @FindBy(css="input#password")
    public WebElement passwordInputField;

    @FindBy(css="button.radius .fa-sign-in")
    public WebElement loginBtn;

    @FindBy(css="div#flash")
    public WebElement logInErrorTextLocator;

    public WebElement getUsernameInputField() {
        return usernameInputField;
    }

    public WebElement getPasswordInputField() {
        return passwordInputField;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getLogInErrorTextLocator() {
        return logInErrorTextLocator;
    }

    public void setUsernameInputField(WebElement usernameInputField) {
        this.usernameInputField = usernameInputField;
    }

    public void setPasswordInputField(WebElement passwordInputField) {
        this.passwordInputField = passwordInputField;
    }
}
