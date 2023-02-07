package com.cydeo.tests.Day5_testNG_intro_dropdowns;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefEX {
    public static void main(String[] args) throws InterruptedException {
        //TC #1: StaleElementReferenceException handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        //3. Click to “Add Element” button
        WebElement addElementButton = driver.findElement(By.xpath("//div[@id='content']//div/button"));
        Thread.sleep(2000);
        addElementButton.click();


        //4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButtonVerification = driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println("deleteButtonVerification.isDisplayed() = " + deleteButtonVerification.isDisplayed());

        Thread.sleep(2000);

        //5. Click to “Delete” button.
        WebElement deleteButton = driver.findElement(By.xpath("//div[@id='elements']//button"));
        deleteButton.click();

        //6. Verify “Delete” button is NOT displayed after clicking.
try {
    deleteButton.isDisplayed();

}catch (StaleElementReferenceException e){
    System.out.println("Stale exception is thrown");
    System.out.println("this means the web element is not on the page anymore");
    System.out.println("deleteButton.isDisplayed()=false");
}
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
driver.quit();
    }
}
