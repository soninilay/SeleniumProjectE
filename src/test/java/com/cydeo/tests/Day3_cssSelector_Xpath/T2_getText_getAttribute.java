package com.cydeo.tests.Day3_cssSelector_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_getText_getAttribute {
    public static void main(String[] args) {

        // TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        // 1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 2- Go to: https://login1.nextbasecrm.com/
        driver.navigate().to("https://login1.nextbasecrm.com");

        // 3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();

        if (actualRememberMeLabel.equals(expectedRememberMeLabel)) {
            System.out.println("Label verification Passed!!");
        } else {
            System.out.println("Label verification Failed!!");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?

        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotPasswordLinkText = "FORGOT YOUR PASSWORD?";
        String actualForgotPasswordLinkText = forgotPasswordLink.getText();

        if (actualForgotPasswordLinkText.equals(expectedForgotPasswordLinkText)) {
            System.out.println("Forgot password link verification Passed!!");
        } else {
            System.out.println("Forgot password link verification Failed!!");
        }

        //        5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes

        String expectedInHref = "https://login1.nextbasecrm.com/?forgot_password=yes";
        String actualHrefAttributes = forgotPasswordLink.getAttribute("href");

        System.out.println("actualHrefAttributes = " + actualHrefAttributes);

        if (actualHrefAttributes.equals(expectedInHref)) {
            System.out.println("HREF attribute value verification passed");
        } else {
            System.out.println("HREF attribute value verification failed!!");
        }


        //PS: Inspect and decide which locator you should be using to locate web elements.
    }
}
