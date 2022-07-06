package com.company;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

class Cwt {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://www.blazedemo.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testCwt() throws Exception {
        // Label: Test
        // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1440,686 | ]]
        driver.get("https://blazedemo.com/");
        driver.findElement(By.name("fromPort")).click();
        new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Boston");
        driver.findElement(By.name("toPort")).click();
        new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("Berlin");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        driver.findElement(By.cssSelector("input.btn.btn-small")).click();
        driver.findElement(By.linkText("Travel The World")).click();
        driver.findElement(By.name("fromPort")).click();
        new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Boston");
        driver.findElement(By.name("toPort")).click();
        new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("New York");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[5]")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.close();
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}

