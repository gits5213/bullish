package com.bullis.uiTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LogInTest {

    @Test
    public void positiveTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com");

        //Landing Page Element
        WebElement formAuthentication = driver.findElement(By.cssSelector("[href='\\/login']"));
        formAuthentication.click();

        //Login Page Elements
        WebElement usernameInputField = driver.findElement(By.cssSelector("input#username"));
        usernameInputField.sendKeys("tomsmith");

        WebElement passwordInputField = driver.findElement(By.cssSelector("input#password"));
        passwordInputField.sendKeys("SuperSecretPassword!");

        WebElement loginBtn = driver.findElement(By.cssSelector("button.radius .fa-sign-in"));
        loginBtn.click();

        //Secure Area page elements
        WebElement loggedInSuccessfulTextLocator = driver.findElement(By.cssSelector("div#flash"));
        String actualLoggedInSuccessfulText = loggedInSuccessfulTextLocator.getText();
        String expectedLoggedInSuccessfulText = "You logged into a secure area!\n" +
                "×";
        Assert.assertEquals(expectedLoggedInSuccessfulText, actualLoggedInSuccessfulText);
        WebElement logoutBtn = driver.findElement(By.cssSelector(".button.radius.secondary"));
        logoutBtn.click();
        Thread.sleep(500);
        driver.quit();

    }

    @Test (priority = 1)
    public void negativeTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com");

        //Landing Page Element
        WebElement formAuthentication = driver.findElement(By.cssSelector("[href='\\/login']"));
        formAuthentication.click();

        //Login Page Elements
        WebElement usernameInputField = driver.findElement(By.cssSelector("input#username"));
        usernameInputField.sendKeys("tomsmith");

        WebElement passwordInputField = driver.findElement(By.cssSelector("input#password"));
        passwordInputField.sendKeys("SuperSecretPassword");

        WebElement loginBtn = driver.findElement(By.cssSelector("button.radius .fa-sign-in"));
        loginBtn.click();

        WebElement logInErrorTextLocator = driver.findElement(By.cssSelector("div#flash"));
        String actualLogInErrorText = logInErrorTextLocator.getText();
        String expectedLogInErrorText = "Your password is invalid!\n" +
                "×";
        Assert.assertEquals(expectedLogInErrorText, actualLogInErrorText);

        Thread.sleep(500);
        driver.quit();

    }
}
