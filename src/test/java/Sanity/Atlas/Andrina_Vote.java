package Sanity.Atlas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Andrina_Vote {

    public static void main(String[] args) throws InterruptedException {
      
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications"); 

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://mycutebaby.in/contest/participant/6707006347bd2?utm_medium=w_10_24#google_vignette");

        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page Title: " + driver.getTitle());
        Thread.sleep(2000);

        // Scroll down by a certain number of pixels
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)", "");

       driver.findElement(By.xpath("//a[@id='vote_btn']")).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}