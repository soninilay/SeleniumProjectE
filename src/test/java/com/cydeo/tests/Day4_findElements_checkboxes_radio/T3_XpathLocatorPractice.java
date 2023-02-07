package com.cydeo.tests.Day4_findElements_checkboxes_radio;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_XpathLocatorPractice {
    public static void main(String[] args) throws InterruptedException {
        //TC #6:  XPATH LOCATOR practice
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/multiple_buttons
        driver.navigate().to("https://practice.cydeo.com/multiple_buttons");
        Thread.sleep(2000);

        //3. Click on Button 1
        WebElement button1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/button[1]"));
        button1.click();

        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”

        String expectedText = "Clicked on button one!";
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        String actualButtonText = resultText.getText();
        System.out.println(actualButtonText);

        if (actualButtonText.equalsIgnoreCase(expectedText)) {
            System.out.println("Verification Passed!!");
        } else {
            System.out.println("Verification Failed!!");

        }
        //
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
