package Sanity.Atlas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class Andrina_Vote {

    WebDriver driver;

    // Setup method to initialize the remote WebDriver
    @BeforeTest
    public void setup() throws MalformedURLException {
        // DesiredCapabilities for remote Chrome execution
        DesiredCapabilities dc = DesiredCapabilities.chrome();

        // URL for the Selenium Grid Hub
        URL url = new URL("http://172.20.23.92:4443/wd/hub");

        // Initialize the remote WebDriver with the capabilities and grid URL
        driver = new RemoteWebDriver(url, dc);
    }

    @Test
    public void voteTest() throws InterruptedException {
        
        driver.get("https://mycutebaby.in/contest/participant/6707006347bd2?utm_medium=w_10_24#google_vignette");

        driver.manage().window().maximize();
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page Title: " + driver.getTitle());

        
        Thread.sleep(2000);

        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1800)", "");
        Thread.sleep(2000);

        
        driver.findElement(By.xpath("//a[@id='vote_btn']")).click();

       
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser after voting
        driver.quit();
    }
}
