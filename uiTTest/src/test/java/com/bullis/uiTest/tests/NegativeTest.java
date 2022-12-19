package com.bullis.uiTest.tests;

import com.bullis.uiTest.testPages.LandingPage;
import com.bullis.uiTest.testPages.LogInPage;
import com.bullis.uiTest.utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NegativeTest extends BaseTest{

    @Test
    @Parameters({ "username", "wrongPassword" })
    public void negativeTest(String username, String wrongPassword)  {

        LandingPage landingPage = new LandingPage(driver);
        LogInPage logInPage = new LogInPage(driver);

        landingPage.formAuthentication.click();
        logInPage.usernameInputField.sendKeys(username);
        logInPage.passwordInputField.sendKeys(wrongPassword);
        logInPage.loginBtn.click();

        String actualLogInErrorText = logInPage.logInErrorTextLocator.getText();
        Assert.assertEquals(Constants.EXPECTED_LOG_IN_ERROR_TEXT, actualLogInErrorText);
    }
}
