package com.cydeo.tests.Day3_cssSelector_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {
        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/ ");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
        // Finding web element using cssSelector with class :  WebElement signInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
        // Finding web element using cssSelector with type  : WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));
        WebElement signIn = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedButtonText = "Log In";

        String actualButtonText = signIn.getAttribute("value");

        System.out.println("actualButtonText = " + actualButtonText);

        if (actualButtonText.equals(expectedButtonText)) {
            System.out.println("Log-in button text verification passed");
        } else {
            System.out.println("Log-in button text verification failed!!");
        }








        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from
    }
}
