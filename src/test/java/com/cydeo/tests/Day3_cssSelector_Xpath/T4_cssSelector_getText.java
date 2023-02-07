package com.cydeo.tests.Day3_cssSelector_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_cssSelector_getText {
    public static void main(String[] args) {
        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        //WebDriverFactory.getDriver("chrome");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password
        WebElement resetButton = driver.findElement(By.cssSelector("button[value='Reset password']"));

        String expectedResetText = "Reset password";

        String actualResetText = resetButton.getText();

        System.out.println("actualResetText = " + actualResetText);

        if (actualResetText.equals(expectedResetText)) {
            System.out.println("Reset button text verification passed");
        } else {
            System.out.println("Reset button text verification failed!!");


            //PS: Inspect and decide which locator you should be using to locate web
            //elements.
            //PS2: Pay attention to where to get the text of this button from


        }
    }
}
