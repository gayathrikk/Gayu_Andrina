package Sanity.Atlas;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class zerodha {

	WebDriver driver; 

    @BeforeTest
    public void setup() {
        
        WebDriverManager.chromedriver().setup();

        // Set up ChromeOptions with user data directory
        String user_data_dir = "C:\\Users\\Gayathri Gayu\\AppData\\Local\\Google\\Chrome\\User Data";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-data-dir=" + user_data_dir);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test
    public void login() throws InterruptedException {
        driver.get("https://www.zomato.com/chennai");
        // driver.get("https://kite.zerodha.com/dashboard");
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);
        Thread.sleep(3000);       
//        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("YUZ302");//YUZ302//PYM368
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Ramya@1979");//Ramya@1979//edZnr#y#wKFPB4A
//        Thread.sleep(2000);
//       driver.findElement(By.cssSelector("button[type='submit']")).click();
//        Thread.sleep(10000); // Wait for the page to load
//        
//
//        // Accept OTP as user input
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter OTP: ");
//        String otp = scanner.nextLine();
//
//        // Enter OTP
//        WebElement otpInput = driver.findElement(By.id("otp"));
//        otpInput.sendKeys(otp);
//        
//        
//
//        // Save cookies after successful login
//       Set<Cookie> cookies = driver.manage().getCookies();
    }

    @AfterTest
    public void close() {
        driver.quit();
    }
}
