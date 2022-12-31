package com.cydeo.tests.Day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) throws InterruptedException {

        //TC #2: Back and forth navigation
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");

        //3- Click to A/B Testing from top of the list.
      //  driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        //4- Verify title is:
        //Expected: No A/B Test
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED");
        } else System.out.println("Title verification FAILED");
        Thread.sleep(3000);

        //5- Go back to home page by using the .back();
        driver.navigate().back();


        //6- Verify title equals:
        //Expected : Practice
        Thread.sleep(3000);
        expectedTitle = "Practice";
        String actualTitle1 = driver.getTitle();
        if (actualTitle1.equals(expectedTitle)) {
            System.out.println("Title verification PASSED");
        } else System.out.println("Title verification FAILED");

        driver.quit();

    }


}

