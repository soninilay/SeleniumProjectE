package com.cydeo.tests.Day5_testNG_intro_dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_RadioButton {
    public static void main(String[] args) throws InterruptedException {
        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.navigate().to("https://practice.cydeo.com/");
        Thread.sleep(2000);

       //my practice to find element on homepage and click on it
        driver.findElement(By.xpath("//ul[@class='list-group']//li[39]//a")).click();

        //my practice to verify
        String expectedText = "Radio buttons";
        System.out.println("expectedText = " + expectedText);
        WebElement radioText = driver.findElement(By.xpath("//div[@class='large-12 columns']//div//h3"));
        String actualText = radioText.getText();
        System.out.println("actualText = " + actualText);

        if (actualText.equals(expectedText)){
            System.out.println("Text verification successful!");
        }else{
            System.out.println("Text verification unsuccessful!");
        }
        System.out.println("------------------------------------");

        //3. Click to “Hockey” radio button
        WebElement hockeyRadioButton = driver.findElement(By.xpath("//*[@id='hockey']"));
        hockeyRadioButton.click();


        //4. Verify “Hockey” radio button is selected after clicking.
        if (hockeyRadioButton.isSelected()){
            System.out.println("Hockey Button Selected, Verification Passed!!");
        }else {
            System.out.println("Hockey Button Not Selected, Try Again!");
        }
        //USE XPATH LOCATOR FOR ALL WEB ELEMENT LOCATORS
        driver.quit();
    }
}
