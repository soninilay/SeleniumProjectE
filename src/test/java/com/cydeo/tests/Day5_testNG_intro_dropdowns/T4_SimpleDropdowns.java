package com.cydeo.tests.Day5_testNG_intro_dropdowns;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T4_SimpleDropdowns {
    // //TC#4: Verifying “Simple dropdown” and “State selection” dropdown
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        ///2. Go to https://practice.cydeo.com/dropdown
        driver.navigate().to("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void simpleDropdownTest() throws InterruptedException {


        //3. Verify “Simple dropdown” default selected value is correct
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();

        String actualSimpleDropdownText = currentlySelectedOption.getText();
        String expectedSimpleDropdownText = "Please select an option";

        //Expected: “Please select an option”

        Assert.assertEquals(actualSimpleDropdownText, expectedSimpleDropdownText);


        //4. Verify “State selection” default selected value is correct
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //Expected: “Select a State”
        String expectedStateDDText = "Select a State";

        String actualStateDDText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualStateDDText,expectedStateDDText);
        //Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(),"Select a state");
        Thread.sleep(2000);


    }

     @AfterMethod
    public void tearDown(){
      driver.close();
    }
}
