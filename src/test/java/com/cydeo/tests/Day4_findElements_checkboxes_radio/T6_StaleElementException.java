package com.cydeo.tests.Day4_findElements_checkboxes_radio;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T6_StaleElementException {
    public static void main (String [] args){

        //TC #6: StaleElementReferenceException Task
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/abtest
        driver.navigate().to("https://practice.cydeo.com/abtest");

        //3- Locate “CYDEO” link, verify it is displayed.
        WebElement link = driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));
        System.out.println("LinkText = " + link.getText());
        System.out.println("link.isDisplayed() = " + link.isDisplayed());

        //4- Refresh the page.
        driver.navigate().refresh();

        //5- Verify it is displayed, again.
        WebElement link1 = driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));
        System.out.println("link.isDisplayed() = " + link1.isDisplayed());

        driver.quit();
    }
}
