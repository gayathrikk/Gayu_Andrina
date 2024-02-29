package Sanity.Atlas;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Atlas_Pins {
	
	   private RemoteWebDriver driver;
		
		@BeforeTest
		
		public void setup() throws MalformedURLException 
		{
			
			  DesiredCapabilities dc = DesiredCapabilities.chrome();
		        URL url = new URL("http://172.20.23.7:5555/wd/hub");
		        driver = new RemoteWebDriver(url, dc);
		
		       
		}
		//@Parameters("URL")
		@Test(priority=1)
		//public void login(@Optional("defaultURL") String URL) throws InterruptedException
		public void login()throws InterruptedException
		{
			//driver.get(URL);
			driver.get("https://apollo2.humanbrain.in/viewer/annotation/portal");
			driver.manage().window().maximize();
	        String currentURL = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentURL);
			WebDriverWait wait = new WebDriverWait(driver, 10);
	    	driver.switchTo().defaultContent(); // Switch back to default content
	    	WebElement viewerElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Viewer']")));
	    	if (viewerElement.isEnabled() && viewerElement.isDisplayed()) {
	    	    viewerElement.click();
	    	    System.out.println("Viewer icon is clicked");
	    	} else {
	    	    System.out.println("Viewer icon is not clickable");
	    	}
	    	
	
	        String parentWindow = driver.getWindowHandle();
	        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Log In ']")));
	        if (loginButton != null) {
	            loginButton.click();
	            System.out.println("Login button clicked successfully.");
	        } else {
	            System.out.println("Login button is not clicked.");
	        }
	       
		  wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		  Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(parentWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
	        if (emailInput != null && emailInput.isDisplayed()) {
	            emailInput.sendKeys("teamsoftware457@gmail.com");
	            System.out.println("Email was entered successfully.");
	        } else {
	           System.out.println("Email was not entered.");
	        }
	        
	
	        WebElement nextButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
	        if (nextButton1 != null) {
	            nextButton1.click();
	            System.out.println("Next button 1 is clicked.");
	        } else {
	            System.out.println("Next button 1 is not clicked.");
	        }
	        
	        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Enter your password']")));
	        passwordInput.sendKeys("Health#123");
	        if (passwordInput.getAttribute("value").equals("Health#123")) {
	            System.out.println("Password was entered successfully.");
	        } else {
	            System.out.println("Password was not entered.");
	        }
	        
	        
	        WebElement nextButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
	        if (nextButton2 != null) {
	            nextButton2.click();
	            System.out.println("Next button 2 is clicked.");
	        } else {
	            System.out.println("Next button 2 is not clicked.");
	        }
	       
	
	        driver.switchTo().window(parentWindow);
	        System.out.println("Login successfully");
	       
	        System.out.println("************************Login validation done***********************");
		        
		}
		
		@Test(priority=2)
		public void series_set() throws InterruptedException
		{
			WebDriverWait wait = new WebDriverWait(driver, 30); 
			driver.switchTo().defaultContent();
	
			
	    	 try {
	    		    WebElement Mouse = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@role='grid']//tr[6]")));
	    		    Mouse.click();
	    		    System.out.println("Human Fetus clicked successfully.");
	    		    Thread.sleep(2000);
	    		} catch (Exception e) {
	    		    System.out.println("Human Fetus not clicked: " + e.getMessage());
	    		}
	    	
	    	 
	    	 try {
	    		    WebElement Brain = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@role='grid']//tr[7]//td[2]")));
	    		    Brain.click();
	    		    System.out.println(" Brain clicked successfully.");
	    		    Thread.sleep(2000);
	    		} catch (Exception e) {
	    		    System.out.println("Brain not clicked: " + e.getMessage());
	    		}
	    	
	    	 
	    	 try {
	 		    WebElement MTB_10 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@role='grid']//tr[25]//td[3]")));
	 		    MTB_10.click();
	 		    System.out.println("FTB-40 clicked successfully.");
	 		    Thread.sleep(2000);
	 		} catch (Exception e) {
	 		    System.out.println(" FTB-40 not clicked: " + e.getMessage());
	 		}
	    	 
	    	 
	    	 String parentWindow = driver.getWindowHandle();
	    	 try {
		 		    WebElement viewericon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nb-icon[@nbtooltip='Viewer']")));
		 		   viewericon.click();
		 		    System.out.println("viewer icon is clicked successfully.");
		 		    Thread.sleep(2000);
		 		} catch (Exception e) {
		 		    System.out.println(" viewer icon is not clicked: " + e.getMessage());
		 		}
	    	 
	    	 wait.until(ExpectedConditions.numberOfWindowsToBe(2));
			  Set<String> allWindows = driver.getWindowHandles();
		        for (String window : allWindows) {
		            if (!window.equals(parentWindow)) {
		                driver.switchTo().window(window);
		                break;
		            }
		        }
	    	 
	    	 try {
	  		    WebElement section = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='883'])[1]")));
	  		    section.click();
	  		    System.out.println("section clicked successfully.");
	  		    Thread.sleep(2000);
	  		} catch (Exception e) {
	  		    System.out.println("section not clicked: " + e.getMessage());
	  		}
	    	 

	    	 System.out.println("************************************Series set validation done********************************");
	
	 	}
		
		@Test(priority=3)
		
		public void atlaseditor() throws InterruptedException
		{
			WebDriverWait wait = new WebDriverWait(driver, 30); 
			driver.switchTo().defaultContent();
			 try {
		  		    WebElement atlaseditor= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Atlas Editor']")));
		  		    atlaseditor.click();
		  		    System.out.println("Atlas Editor open");
		  		    Thread.sleep(2000);
		  		} catch (Exception e) {
		  		    System.out.println("Atlas Editor is not open: " + e.getMessage());
		  		}
			 Thread.sleep(6000);
			 System.out.println("************************Atlas Editor open sucessfully***********************");
			 Thread.sleep(6000);
			 
		}
		@Test(priority=4)
		public void Editmenu() throws InterruptedException
		{
	
			WebDriverWait wait = new WebDriverWait(driver, 30); 
			driver.switchTo().defaultContent();
			 try {
		  		    WebElement Editmenu= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Edit Menu']")));
		  		    Editmenu.click();
		  		    System.out.println("Edit menu open successfully.");
		  		    Thread.sleep(2000);
		  		} catch (Exception e) {
		  		    System.out.println("Edit menu is not open: " + e.getMessage());
		  		}
		}
			 
		 @Test(priority=5)
		 public void add_pins1()
		 {
			 WebDriverWait wait = new WebDriverWait(driver, 30); 
				driver.switchTo().defaultContent();
				 try {
			  		    WebElement Editmenu= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Add Pins']")));
			  		    Editmenu.click();
			  		    System.out.println("add pins clicked successfully.");
			  		    Thread.sleep(2000);
			  		} catch (Exception e) {
			  		    System.out.println("add pins is not clicked : " + e.getMessage());
			  		}
				 
				 WebElement canvas = driver.findElement(By.xpath("//canvas"));
			     Actions actions = new Actions(driver);
			     
			     actions.moveToElement(canvas)
		            .click()
		            .release()
		            .perform();
			     System.out.println("Add pin windows opened");
		 
			     driver.switchTo().frame(0);
			    driver.findElement(By.xpath("//body[@class='mce-content-body ']")).sendKeys("Testing 1..."); 
			    driver.switchTo().defaultContent();
			    try {
		  		    WebElement Save= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		  		  Save.click();
		  		    System.out.println("save option clicked successfully.");
		  		    Thread.sleep(2000);
		  		} catch (Exception e) {
		  		    System.out.println("save option is not clicked : " + e.getMessage());
		  		}
//			    WebDriverWait Wait = new WebDriverWait(driver, 10);
//				By toasterLocator = By.xpath("//div[text()='Pins Saved successfully']']");
//				WebElement toasterElement = Wait.until(ExpectedConditions.presenceOfElementLocated(toasterLocator));
//				String toasterMessage = toasterElement.getText();
//				AssertJUnit.assertEquals("Pins Saved successfully", toasterMessage);
//				System.out.println("***************Pins text saved sucessfully****************");
		  		}
	     
	     
	     @Test(priority=6)
		 public void add_pins2()
		 {
			 WebDriverWait wait = new WebDriverWait(driver, 30); 
				driver.switchTo().defaultContent();
				 try {
			  		    WebElement Editmenu= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Add Pins']")));
			  		    Editmenu.click();
			  		    System.out.println("add pins clicked successfully.");
			  		    Thread.sleep(2000);
			  		} catch (Exception e) {
			  		    System.out.println("add pins is not clicked : " + e.getMessage());
			  		}
				 
				 WebElement canvas = driver.findElement(By.xpath("//canvas"));
			     Actions actions = new Actions(driver);
			     
			     actions.moveToElement(canvas)
			        .moveByOffset(200, 0)
		            .click()
		            .release()
		            .perform();
			     System.out.println("Add pin windows opened");
		 
			     
	    	   driver.switchTo().frame(0);
			    driver.findElement(By.xpath("//body[@class='mce-content-body ']")).sendKeys("Testing 2..."); 
			    driver.switchTo().defaultContent();
			    try {
		  		    WebElement Save= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		  		  Save.click();
		  		    System.out.println("save option clicked successfully.");
		  		    Thread.sleep(2000);
		  		} catch (Exception e) {
		  		    System.out.println("save option is not clicked : " + e.getMessage());
		  		}
			    
//			    WebDriverWait Wait = new WebDriverWait(driver, 10);
//				By toasterLocator = By.xpath("//div[text()='Pins Saved successfully']']");
//				WebElement toasterElement = Wait.until(ExpectedConditions.presenceOfElementLocated(toasterLocator));
//				String toasterMessage = toasterElement.getText();
//				AssertJUnit.assertEquals("Pins Saved successfully", toasterMessage);
//				System.out.println("***************Pins text saved sucessfully****************");
	     }
	     
	     @Test(priority=7)
		 public void add_pins3()
		 {
			 WebDriverWait wait = new WebDriverWait(driver, 30); 
				driver.switchTo().defaultContent();
				 try {
			  		    WebElement Editmenu= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Add Pins']")));
			  		    Editmenu.click();
			  		    System.out.println("add pins clicked successfully.");
			  		    Thread.sleep(2000);
			  		} catch (Exception e) {
			  		    System.out.println("add pins is not clicked : " + e.getMessage());
			  		}
				 
				 WebElement canvas = driver.findElement(By.xpath("//canvas"));
			     Actions actions = new Actions(driver);
			     
			     actions.moveToElement(canvas)
			        .moveByOffset(0, 200)
		            .click()
		            .release()
		            .perform();
			     System.out.println("Add pin windows opened");
		 
			     
	    	   driver.switchTo().frame(0);
			    driver.findElement(By.xpath("//body[@class='mce-content-body ']")).sendKeys("Testing 3..."); 
			    driver.switchTo().defaultContent();
			    try {
		  		    WebElement Save= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		  		  Save.click();
		  		    System.out.println("save option clicked successfully.");
		  		    Thread.sleep(2000);
		  		} catch (Exception e) {
		  		    System.out.println("save option is not clicked : " + e.getMessage());
		  		}
//			    WebDriverWait Wait = new WebDriverWait(driver, 10);
//				By toasterLocator = By.xpath("//div[text()='Pins Saved successfully']']");
//				WebElement toasterElement = Wait.until(ExpectedConditions.presenceOfElementLocated(toasterLocator));
//				String toasterMessage = toasterElement.getText();
//				AssertJUnit.assertEquals("Pins Saved successfully", toasterMessage);
//				System.out.println("***************Pins text saved sucessfully****************");
	     }
	     
	     @Test(priority=8)
	     public void show_pins() throws InterruptedException
	     {
	    	 WebDriverWait wait = new WebDriverWait(driver, 30); 
	    	 try {
		  		    WebElement showpins= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Show Pins']")));
		  		  showpins.click();
		  		    System.out.println("show pins clicked successfully.");
		  		    Thread.sleep(2000);
		  		} catch (Exception e) {
		  		    System.out.println("show pins is not clicked : " + e.getMessage());
		  		}
	    	 Thread.sleep(3000);
	     }
	     
	     @Test(priority=9)
	     public void Retrive_pin1()
	     {
	    	 WebElement canvas = driver.findElement(By.xpath("//canvas"));
		     Actions actions = new Actions(driver);
		     
		     actions.moveToElement(canvas)
	            .click()
	            .release()
	            .perform();
		     driver.switchTo().frame(0);
		     WebElement text1 = driver.findElement(By.xpath("//body[@class='mce-content-body ']"));
		     String actualText = text1.getText();
		     String expectedText = "Testing 1...";
			     
			     Assert.assertEquals(actualText, expectedText, "Texts are not equal");
			     
		 }
	     
	     
//	     @Test(priority=10)
//	     public void Retrive_pin2()
//	     {
//	    	 WebElement canvas = driver.findElement(By.xpath("//canvas"));
//		     Actions actions = new Actions(driver);
//		     
//		     actions.moveToElement(canvas)
//		        .moveByOffset(200, 0)
//	            .click()
//	            .release()
//	            .perform();
//		     driver.switchTo().frame(0);
//		     WebElement text1 = driver.findElement(By.xpath("//body[@class='mce-content-body ']"));
//		     String actualText = text1.getText();
//		     String expectedText = "Testing 2...";
//			     
//			     Assert.assertEquals(actualText, expectedText, "Texts are not equal");
//			     
//		 }
//	     
//	     
//	     @Test(priority=11)
//	     public void Retrive_pin3()
//	     {
//	    	 WebElement canvas = driver.findElement(By.xpath("//canvas"));
//		     Actions actions = new Actions(driver);
//		     
//		     actions.moveToElement(canvas)
//		        .moveByOffset(0, 200)
//	            .click()
//	            .release()
//	            .perform();
//		     driver.switchTo().frame(0);
//		     WebElement text1 = driver.findElement(By.xpath("//body[@class='mce-content-body ']"));
//		     String actualText = text1.getText();
//		     String expectedText = "Testing 3...";
//			     
//			     Assert.assertEquals(actualText, expectedText, "Texts are not equal");
//			     
//		 }
	     
	     
	@AfterTest
		public void close() throws Exception
		{
			
			driver.quit();
	
	}

}
