package com.cydeo.tests.Day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearchVerification {
    public static void main(String[] args) throws InterruptedException {
        //TC#3: Google search
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.navigate().to("https://google.com");

        // driver.manage().window().fullscreen();
        Thread.sleep(2000);

        // To reject cookies when prompted on browser
        driver.findElement(By.cssSelector("button[id='W0wltc']")).click();
        Thread.sleep(2000);

        // To accept cookies when prompted on browser
        //driver.findElement(By.cssSelector("button[id='L2AGLb']")).click();


        //3- Write “apple” in search box
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple" + Keys.ENTER);
        Thread.sleep(2000);

        //4- Click google search button
        //  WebElement search = driver.findElement(By.name("btnK"));
        //search.click();

        //5- Verify title:
        //Expected: Title should start with “apple” word

        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedTitle)) {
            System.out.println("Title verification PASSED");
        } else
            System.out.println("Title verification FAILED");

        driver.quit();
    }
}
