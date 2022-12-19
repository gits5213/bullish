package com.bullis.uiTest.testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage{

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="[href='\\/login']")
    public WebElement formAuthentication;



}
