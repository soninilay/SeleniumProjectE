package com.cydeo.tests.day1_seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        //1 set up the browser driver

        WebDriverManager.chromedriver().setup();

        //2 create instance of the selenium webdriver
        // this is the line opening an empty browser
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();

        driver.manage().window().fullscreen();

        Thread.sleep(2000);

        //3 go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //stop code execution for 3 second
        Thread.sleep(3000);

        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);


        // get the current url using selenium
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        // use selenium to navigate back
        driver.navigate().back();


        Thread.sleep(3000);

        // selenium to navigate forward
        driver.navigate().forward();

        //stop code execution for 3 second
        Thread.sleep(2000);

        // use selenium to navigate refresh
        driver.navigate().refresh();

        Thread.sleep(2000);

        //use navigate().to():
        driver.navigate().to("https://www.google.com");


        Thread.sleep(2000);

        // get title of the page
        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        // get the current url using selenium
        currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //it closes the browser
        //driver.close();

    }

}
