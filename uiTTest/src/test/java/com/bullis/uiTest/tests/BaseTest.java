package com.bullis.uiTest.tests;

import com.bullis.uiTest.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void beforeClass(String browser){
        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        }
    }

    @BeforeMethod
    public void beforeMethod(){
        driver.get(Constants.URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void afterTest(){
        System.out.println("Method is executing...");
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

    public static void sleepTest(long sleepTime){
        try{Thread.sleep(sleepTime);
        }catch (Exception e){
        }
    }
}
