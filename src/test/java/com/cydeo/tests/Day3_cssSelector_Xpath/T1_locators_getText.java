package com.cydeo.tests.Day3_cssSelector_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) {

        //  TC #1: NextBaseCRM, locators and getText() practice
        //  1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //  2- Go to: https://login1.nextbasecrm.com/
        driver.navigate().to("https://login1.nextbasecrm.com");

        //  3- Enter incorrect username: “incorrect”
        //driver.findElement(By.name("USER_LOGIN")).sendKeys("incorrect");
        WebElement userName = driver.findElement(By.name("USER_LOGIN"));
        userName.sendKeys("incorrect");

        //  4- Enter incorrect password: “incorrect”
        //driver.findElement(By.name("USER_PASSWORD")).sendKeys("incorrect");
        WebElement userPassword = driver.findElement(By.name("USER_PASSWORD"));
        userPassword.sendKeys("incorrect");

        // click on checkbox "Remember user to this computer"
        driver.findElement(By.id("USER_REMEMBER")).click();

        //   5- Click the login button.
        driver.findElement(By.className("login-btn")).click();

        //   6- Verify error message text is as expected:
        //   Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();

        if (actualErrorMessage.equals(expectedErrorMessage)) {
            System.out.println("Error message verification PASSED");
        } else
            System.out.println("Error message verification FAILED");

        driver.close();
    }
}
