package com.cydeo.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// TASK: NEW METHOD CREATION
// Method Name = getDriver
// Static Method
// Accepts String arg: browserType
//      -   This arg will determine what type of browser is opened
//      -   If "chrome" passed ---> it will open Chrome Browser
//      -   If "firefox" passed ---> it will open Firefox Browser
// Return Type :  "WebDriver"
public class WebDriverFactory {

    public static WebDriver getDriver(String browserType) {

        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        } else {
            System.out.println("Given browser type does not exits/or is not currently supported");

            System.out.println("Driver = null");
            return null;
        }
    }
}
