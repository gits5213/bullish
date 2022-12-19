package com.bullis.uiTest.testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecureAreaPage extends BasePage{
    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="div#flash")
    public WebElement loggedInSuccessfulTextLocator;

    @FindBy(css=".button.radius.secondary")
    public WebElement logoutBtn;

    public WebElement getLoggedInSuccessfulTextLocator() {
        return loggedInSuccessfulTextLocator;
    }

    public WebElement getLogoutBtn() {
        return logoutBtn;
    }
}
