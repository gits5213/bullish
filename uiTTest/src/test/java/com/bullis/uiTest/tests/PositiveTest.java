package com.bullis.uiTest.tests;

import com.bullis.uiTest.testPages.LandingPage;
import com.bullis.uiTest.testPages.LogInPage;
import com.bullis.uiTest.testPages.SecureAreaPage;
import com.bullis.uiTest.utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PositiveTest extends BaseTest {

    @Test
    @Parameters({ "username", "password" })
    public void positiveTest(String username, String password)  {

        LandingPage landingPage = new LandingPage(driver);
        LogInPage logInPage = new LogInPage(driver);
        SecureAreaPage secureAreaPage = new SecureAreaPage(driver);

        landingPage.formAuthentication.click();
        logInPage.usernameInputField.sendKeys(username);
        logInPage.passwordInputField.sendKeys(password);
        logInPage.loginBtn.click();

        String actualLoggedInSuccessfulText = secureAreaPage.loggedInSuccessfulTextLocator.getText();
        Assert.assertEquals(Constants.EXPECTED_LOGGED_IN_SUCCESSFUL_TEXT, actualLoggedInSuccessfulText);
        secureAreaPage.logoutBtn.click();
    }
}