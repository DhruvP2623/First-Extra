package org.example;

import org.openqa.selenium.chrome.ChromeDriver;



public class DriverManager extends Utils {

    public void openBrowser() {

        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // To maximize the browser
        driver.manage().window().maximize();
        //.get() method is used to open URL and it will wait till the whole page gets loaded
        driver.get("https://demo.nopcommerce.com/");
    }
}