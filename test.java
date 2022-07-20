import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

//class auth {
//    private final static String API_KEY = "59d4ef8e81c54dafca174edc";
//    private final static String API_SECRET = "e39c1d08710f741c5b8996530e7dc3f0ebcaed1e440d7596e3f4f71905d3ef1ac1be8358";
//    private final static String BASE = "a.blazemeter.com";
//    private final static String curl = String.format("https://%s/api/v4/grid/wd/hub", BASE);
//
//}
//
////        DesiredCapabilities capabilities = new DesiredCapabilities();
////        capabilities.setCapability("blazemeter.apiKey", API_KEY);
////        capabilities.setCapability("blazemeter.apiSecret", API_SECRET);
////        capabilities.setCapability("blazemeter.reportName", "First functional test from IDE");
////        capabilities.setCapability("blazemeter.sessionName", "firefox browser test");
////        capabilities.setCapability("browserName", "firefox");

public class test {
    public static void main(String[] args) throws MalformedURLException {
        final String API_KEY = "59d4ef8e81c54dafca174edc";
        final String API_SECRET = "e39c1d08710f741c5b8996530e7dc3f0ebcaed1e440d7596e3f4f71905d3ef1ac1be8358";
        final String BASE = "a.blazemeter.com";
        final String curl = String.format("https://%s/api/v4/grid/wd/hub", BASE);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("blazemeter.apiKey", API_KEY);
        capabilities.setCapability("blazemeter.apiSecret", API_SECRET);
        capabilities.setCapability("blazemeter.reportName", "CWT FROM JENKINS 0720");
        capabilities.setCapability("blazemeter.sessionName", "firefox browser test");
        capabilities.setCapability("browserName", "firefox");
//        capabilities.setCapability("blazemeter.locationId ", "us-east-1");
        capabilities.setCapability("blazemeter.locationId ", "harbor-5d25f94f9950ce73cd105f53");




        URL url = new URL(curl);
        WebDriver driver;
        driver = new RemoteWebDriver(url, capabilities);

//        System.setProperty("webdriver.gecko.driver", "/Users/henokjiru/Downloads/geckodriver");
//        driver = new FirefoxDriver();

        // Test name: Flights
        // Step # | name | target | value
        // 1 | open | / |
        driver.get("https://blazedemo.com/");

        // 2 | setWindowSize | 1313x1080 |
        driver.manage().window().setSize(new Dimension(1313, 1080));


        // 3 | click | name=fromPort |
        driver.findElement(By.name("fromPort")).click();


        // 4 | select | name=fromPort | label=Boston
        {
            WebElement dropdown = driver.findElement(By.name("fromPort"));
            dropdown.findElement(By.xpath("//option[. = 'Boston']")).click();
        }


        // 5 | click | name=toPort |
        driver.findElement(By.name("toPort")).click();


        // 6 | select | name=toPort | label=New York
        {
            WebElement dropdown = driver.findElement(By.name("toPort"));
            dropdown.findElement(By.xpath("//option[. = 'New York']")).click();
        }


        // 7 | click | css=.btn-primary |
        driver.findElement(By.cssSelector(".btn-primary")).click();


        // 8 | click | css=tr:nth-child(1) .btn |
        driver.findElement(By.cssSelector("tr:nth-child(1) .btn")).click();


        // 9 | click | id=inputName |
        driver.findElement(By.id("inputName")).click();


        // 10 | type | id=inputName | Henok
        driver.findElement(By.id("inputName")).sendKeys("Henok");


        // 11 | type | id=address | 123 Manin Str
        driver.findElement(By.id("address")).sendKeys("123 Manin Str");


        // 12 | type | id=city | Atlanta
        driver.findElement(By.id("city")).sendKeys("Atlanta");
        // 13 | type | id=state | GA
        driver.findElement(By.id("state")).sendKeys("GA");
        // 14 | type | id=zipCode | 30324
        driver.findElement(By.id("zipCode")).sendKeys("30324");
        // 15 | click | id=cardType |
        driver.findElement(By.id("cardType")).click();
        // 16 | select | id=cardType | label=American Express
        {
            WebElement dropdown = driver.findElement(By.id("cardType"));
            dropdown.findElement(By.xpath("//option[. = 'American Express']")).click();
        }
        // 17 | click | id=creditCardNumber |
        driver.findElement(By.id("creditCardNumber")).click();
        // 18 | type | id=creditCardNumber | 1111222233334444
        driver.findElement(By.id("creditCardNumber")).sendKeys("1111222233334444");
        // 19 | click | id=creditCardYear |
        driver.findElement(By.id("creditCardYear")).click();
        // 20 | type | id=creditCardYear | 2020
        driver.findElement(By.id("creditCardYear")).sendKeys("2020");
        // 21 | click | id=nameOnCard |
        driver.findElement(By.id("nameOnCard")).click();
        // 22 | type | id=nameOnCard | Henok Jiru
        driver.findElement(By.id("nameOnCard")).sendKeys("Henok Jiru");
        // 23 | click | css=.btn-primary |
        driver.findElement(By.cssSelector(".btn-primary")).click();

        driver.close();
        driver.quit();
    }
}
