package com.cydeo.tests.Day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerification {
    public static void main(String[] args) {

        //TC 1 CYDEO PRACTICE TOOL VERIFICATIONS
        //1 OPEN CHROME BROWSER
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2 GOT TO HTTPS://PRACTICE.CYDEO.COM
        //driver.get("https://practice.cydeo.com");
        driver.navigate().to("https://practice.cydeo.com");


        //3 VERIFY URL CONTAINS
        // Expected : cydeo
        String expectedUrl = "cydeo";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("URL verification PASSED");
        } else
            System.out.println("URL verification FAILED");

        //4. Verify title:
        // Expected : Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED");
        } else
            System.out.println("Title verification FAILED");

        driver.close();
    }

}
