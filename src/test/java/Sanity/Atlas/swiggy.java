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

public class swiggy {
	
	 WebDriver driver;
	    private WebDriverWait wait;

	    @BeforeTest
	    public void setup() throws InterruptedException {
	        // Initialize ChromeDriver using WebDriverManager
	    	 WebDriverManager.chromedriver().setup();
	         ChromeOptions options = new ChromeOptions();
	         options.addArguments("--disk-cache=true");
	         driver = new ChromeDriver(options); // Assigning ChromeDriver object to class-level WebDriver
	         driver.manage().window().maximize();
	         
	         }
	        
	        @Test(priority=1)
	        public void login() throws InterruptedException
	        {
	        
	        driver.get("https://www.swiggy.com/my-account");
	        String currentURL = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentURL);
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[text()='Sign In']")).click();
	        driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7397515870");
	        driver.findElement(By.xpath("//a[text()='Login']")).click();
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter OTP: ");
	        String otp = scanner.nextLine();

	        // Enter OTP
	        WebElement otpInput = driver.findElement(By.id("otp"));
	        otpInput.sendKeys(otp);
	        
	        driver.findElement(By.xpath("//a[text()='VERIFY OTP']")).click();
	        Thread.sleep(20000);
	        
	        Set<Cookie> cookies = driver.manage().getCookies();
	        
	    }
	    @Test(priority=2)
	    public void login2() throws InterruptedException
	    {
	    	driver.get("https://www.swiggy.com/my-account");
	    	String currentURL = driver.getCurrentUrl();
		    System.out.println("Current URL: " + currentURL);
		    Thread.sleep(5000);
	    	
	    }

	    @AfterTest
	    public void close() {
	        driver.quit();
	    }

}
