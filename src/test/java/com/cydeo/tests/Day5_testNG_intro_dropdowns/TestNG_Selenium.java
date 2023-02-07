package com.cydeo.tests.Day5_testNG_intro_dropdowns;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //Do browser driver setup
        //open browser
        driver = WebDriverFactory.getDriver("chrome");

        //maximize the page
        driver.manage().window().maximize();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //get "https://google.com"
        driver.navigate().to("https://google.com");

    }


    @Test
    public void selenium_test() {
        //Assert : title is "Google"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not matching here.");

    }


    @AfterMethod

    public void tearDownMethod() {
        driver.close();

    }
}
