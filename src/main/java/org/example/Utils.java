package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;

import static java.time.Duration.*;


public class Utils extends BasePage {
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static void getTextFromElement(By by) {
        driver.findElement(by).getText();
    }

    public static String getTimeStamp() {
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        return timeStamp;
    }

    public static void selectFromDropdownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static void selectFromDropDownByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }

    public static void selectFromDropDownByIndex(By by, int num) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(num);
    }

//    public void waitForElementToBeVisible(By by, int duration) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    //}
    public void WaitForElementToBeClickable(By by,int duration) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.elementToBeClickable(by));


    }
    public void WaitForUrlTobe(String url,int duration){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.urlToBe(url));

    }

}








